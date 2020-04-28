package br.com.qintess.eventos.controller;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.qintess.eventos.dao.Dao;
import br.com.qintess.eventos.model.Client;
import br.com.qintess.eventos.model.ConcertHall;
import br.com.qintess.eventos.model.Event;

@Controller
@RequestMapping("/eventRegistration")
public class EventRegistrationController {

	@Autowired
	private Dao dao;

	@RequestMapping("")
	public String view(Model model) {
		model.addAttribute("event", new Event());
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String username = auth.getName();
		Client owner = dao.getAll(Client.class).stream().filter(c -> c.getEmail().equals(username))
				.findFirst().get();
		List<ConcertHall> concertHalls = owner.getConcertHalls();
		List<Event> events = new ArrayList<Event>();
		for (ConcertHall concertHall : concertHalls) {
			for (Event event : concertHall.getEvents()) {
				events.add(event);
			}
		}
		model.addAttribute("events", events);
		model.addAttribute("concertHalls", concertHalls);
		return "eventRegistration";
	}

	@RequestMapping("/saveMerge")
	public String saveMerge(@ModelAttribute Event event,
			@RequestParam(required = false, value = "concertHallId") int concertHallId,
			@RequestParam(required = false, value = "cancel") String cancel,
			@RequestParam(required = false, value = "image") MultipartFile image, RedirectAttributes redirectAtt) {
		byte[] bImage;
		try {
			if (cancel != null) {
				return "redirect:/eventRegistration";
			}

			if (image != null && image.getSize() > 0) {
				bImage = image.getBytes();
				event.setEventImage(bImage);
			}

			ConcertHall concertHall = dao.getById(ConcertHall.class, concertHallId);

			if (event.getId() == 0) {
				event.setConcertHall(concertHall);
				dao.save(event);
				redirectAtt.addFlashAttribute("successMessage", "Evento registrado com sucesso!");
			} else {
				Event eventConfirmation = dao.getById(Event.class, event.getId());
				if (concertHall.getId() != eventConfirmation.getConcertHall().getId()) {
					event.setConcertHall(concertHall);
				} else {
					event.setConcertHall(eventConfirmation.getConcertHall());
				}
				dao.merge(event);
				redirectAtt.addFlashAttribute("successMessage", "Evento alterado com sucesso!");
			}
		} catch (Exception e) {
			redirectAtt.addFlashAttribute("errorMessage", "ERRO GRAVE: " + e.getMessage());
		}

		return "redirect:/eventRegistration";
	}

	@RequestMapping("/remove/{id}")
	public String remove(@PathVariable(name = "id") int id, RedirectAttributes redirectAtt) {
		Event event = dao.getById(Event.class, id);
		dao.remove(event);
		redirectAtt.addFlashAttribute("successMessage", "Evento removido com successo!");
		return "redirect:/eventRegistration";
	}

	@RequestMapping("/mergeView/{id}")
	public String mergeView(@PathVariable(name = "id") int id, Model model, RedirectAttributes redirectAtt) {
		try {

			Event event = dao.getById(Event.class, id);
			List<ConcertHall> concertHalls = dao.getAll(ConcertHall.class);
			byte[] encodeBase64 = Base64.getEncoder().encode(event.getEventImage());
			String base64Encoded = new String(encodeBase64, "UTF-8");
			event.setEncodedImage(base64Encoded);

			model.addAttribute("events", dao.getAll(Event.class));
			model.addAttribute("event", event);
			model.addAttribute("concertHalls", concertHalls);
		} catch (Exception e) {
			redirectAtt.addFlashAttribute("errorMessage", "ERRO GRAVE: " + e.getMessage());
		}
		return "eventRegistration";
	}
}
