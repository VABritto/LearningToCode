package br.com.qintess.eventos.controller;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.qintess.eventos.dao.Dao;
import br.com.qintess.eventos.model.Client;
import br.com.qintess.eventos.model.Event;
import br.com.qintess.eventos.model.TicketSales;

@Controller
@RequestMapping("/eventDetails")
public class EventDetailsController {

	@Autowired
	private Dao dao;

	@RequestMapping("")
	public String view() {

		return "eventDetails";
	}

	@RequestMapping("/id/{id}")
	public String id(@PathVariable(name = "id") int id, Model model, RedirectAttributes redirectAtt) {
		try {
			Event event = dao.getById(Event.class, id);
			byte[] encodeBase64 = Base64.getEncoder().encode(event.getEventImage());
			event.setEncodedImage(new String(encodeBase64, "UTF-8"));
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			String username = auth.getName();
			Client user = dao.getAll(Client.class).stream().filter(c -> c.getEmail().equals(username)).findFirst()
					.get();
			
			model.addAttribute("user", user);
			model.addAttribute("event", event);
		} catch (Exception e) {
			redirectAtt.addFlashAttribute("errorMessage", "ERRO GRAVE: " + e.getMessage());
		}
		return "eventDetails";
	}

	@RequestMapping("/buyTickets/{id}")
	public String buyTickets(@PathVariable(name = "id") int id, Model model, RedirectAttributes redirectAtt,
			@RequestParam(value = "tickets") int tickets) {
		try {

			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			String username = auth.getName();
			Client user = dao.getAll(Client.class).stream().filter(c -> c.getEmail().equals(username)).findFirst()
					.get();

			Event event = dao.getById(Event.class, id);
			byte[] encodeBase64 = Base64.getEncoder().encode(event.getEventImage());
			event.setEncodedImage(new String(encodeBase64, "UTF-8"));

			if (user.getEvents().isEmpty() && event.getTotalTickets() - tickets >= 0) {

				int totalTickets = event.getTotalTickets() - tickets;
				event.setTotalTickets(totalTickets);

				dao.merge(event);

				TicketSales eventTicket = new TicketSales(event, user, tickets);
				dao.save(eventTicket);
				user.getEvents().add(eventTicket);
				dao.merge(user);

				redirectAtt.addFlashAttribute("successMessage", "Ingresso comprado com successo!");
				return "redirect:/eventDetails/id/{id}";

			} else if (user.getEvents().isEmpty()) {
				redirectAtt.addFlashAttribute("soldOutMessage",
						"Desculpe! Essa quantidade de ingressos não está disponível para esse show!");
				return "redirect:/eventDetails/id/{id}";
			} else {

				for (TicketSales eventTicket : user.getEvents()) {

					if (eventTicket.getEvent().getId() == event.getId()) {
						if (tickets + eventTicket.getQuantity() <= 4 && event.getTotalTickets() - tickets >= 0) {
							int totalTickets = event.getTotalTickets() - tickets;
							event.setTotalTickets(totalTickets);

							int newQuantity = eventTicket.getQuantity() + tickets;
							eventTicket.setQuantity(newQuantity);
							user.addEventTicket(eventTicket);
							TicketSales ticketSales = dao.getAll(TicketSales.class).stream()
									.filter(t -> t.getId() == eventTicket.getId()).findFirst().get();

							dao.merge(event);
							dao.merge(ticketSales);
							dao.merge(user);

							redirectAtt.addFlashAttribute("successMessage", "Ingresso comprado com successo!");
							return "redirect:/eventDetails/id/{id}";
						} else {
							redirectAtt.addFlashAttribute("soldOutMessage",
									"Desculpe! Essa quantidade de ingressos não está disponível para esse show!");
							return "redirect:/eventDetails/id/{id}";
						}
					}
				}
				
				for (TicketSales eventTicket : user.getEvents()) {
					if (eventTicket.getEvent().getId() != event.getId() && event.getTotalTickets() - tickets >= 0) {

						int totalTickets = event.getTotalTickets() - tickets;
						event.setTotalTickets(totalTickets);
						dao.merge(event);

						eventTicket.setClient(user);
						eventTicket.setEvent(event);
						eventTicket.setQuantity(tickets);
						dao.save(eventTicket);
						user.addEventTicket(eventTicket);
						dao.merge(user);
						redirectAtt.addFlashAttribute("successMessage", "Ingresso comprado com successo!");
						return "redirect:/eventDetails/id/{id}";

					}

				}

			}
			model.addAttribute("event", event);
			model.addAttribute("user", user);
		} catch (Exception e) {
			redirectAtt.addFlashAttribute("errorMessage", "ERRO GRAVE: " + e.getMessage());
		}

		return "eventDetails/id/{id}";

	}
}
