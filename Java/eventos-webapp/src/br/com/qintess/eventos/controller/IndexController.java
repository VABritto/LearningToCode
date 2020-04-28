package br.com.qintess.eventos.controller;

import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.qintess.eventos.dao.Dao;
import br.com.qintess.eventos.model.Event;

@Controller
public class IndexController {

	@Autowired
	private Dao dao;

	@RequestMapping("")
	public String index(Model model) {
		try {
			List<Event> events = dao.getAll(Event.class);
			LocalDateTime currentDateTime = LocalDateTime.now();
			model.addAttribute("currentDateTime", currentDateTime);
			model.addAttribute("events", encodeEventImage(events));
		} catch (UnsupportedEncodingException e) {
			model.addAttribute("errorMessage", "ERRO GRAVE: " + e.getMessage());
		}
		return "index";
	}

	@RequestMapping("/menu")
	public String menu(Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		model.addAttribute("loggedInUser", auth);
		return "menu";
	}

	private List<Event> encodeEventImage(List<Event> events) throws UnsupportedEncodingException {

		for (Event event : events) {
			byte[] encodeBase64 = Base64.getEncoder().encode(event.getEventImage());
			event.setEncodedImage(new String(encodeBase64, "UTF-8"));
		}
		return events;
	}
}
