package br.com.qintess.eventos.controller;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.qintess.eventos.dao.Dao;
import br.com.qintess.eventos.model.Event;

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
			Event event = dao.getById(Event.class, id);
			byte[] encodeBase64 = Base64.getEncoder().encode(event.getEventImage());
			event.setEncodedImage(new String(encodeBase64, "UTF-8"));
			if (event.getTotalTickets() - tickets >= 0) {

				int totalTickets = event.getTotalTickets() - tickets;
				event.setTotalTickets(totalTickets);
				dao.merge(event);
				//TODO Vou depois fazer as mudanças no cliente aqui.
				
			} else {
				redirectAtt.addFlashAttribute("soldOutMessage", "Desculpe! Não essa essa quantidade de ingressos disponíveis para esse show!");
			} 
			
			model.addAttribute("event", event);
			
		} catch (Exception e) {
			redirectAtt.addFlashAttribute("errorMessage", "ERRO GRAVE: " + e.getMessage());
		}
		return "eventDetails";

	}
}
