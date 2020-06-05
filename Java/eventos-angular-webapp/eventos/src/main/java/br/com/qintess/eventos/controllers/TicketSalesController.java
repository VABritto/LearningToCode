package br.com.qintess.eventos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.qintess.eventos.dados.EventRepository;
import br.com.qintess.eventos.dados.TicketSalesRepository;
import br.com.qintess.eventos.dados.UserRepository;
import br.com.qintess.eventos.model.Event;
import br.com.qintess.eventos.model.TicketSales;
import br.com.qintess.eventos.model.User;

import javax.persistence.Table;

@RestController
@RequestMapping("/api")
@Table(name = "ticket_sales")
public class TicketSalesController {

	@Autowired
	private TicketSalesRepository repository;
	
	@Autowired
	private EventRepository eventRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/ticketSales")
	public List<TicketSales> getTicketSales() {
		return repository.findAll();
	}
	
	@PostMapping("/ticketSales/{userId}/{eventId}")
	public List<TicketSales> postTicketSales(@RequestBody TicketSales ticketSales,
			@PathVariable("userId") Integer userId,
			@PathVariable("eventId") Integer eventId) {
		User user = userRepository.findById(userId).orElse(new User());
		Event event = eventRepository.findById(eventId).orElse(new Event());
		Integer tickets = event.getTotalTickets() - ticketSales.getQuantity();

		if (tickets >= 0 && ticketSales.getQuantity() <= 4) {
			ticketSales.setUser(user);
			ticketSales.setEvent(event);
			event.setTotalTickets(tickets);
			repository.save(ticketSales);
			return repository.findAll();
		}
		
		return null;
	}

	@PutMapping("/ticketSales/{id}/")
	public List<TicketSales> postTicketSales(@RequestBody TicketSales newTicketSales, @PathVariable("id") Integer id) {
		TicketSales ticketSales = repository.findById(id).orElse(new TicketSales());
		Integer newQuantity = ticketSales.getQuantity() + newTicketSales.getQuantity();
		Integer eventQuantity = ticketSales.getEvent().getTotalTickets() - newTicketSales.getQuantity();
		if(newQuantity <= 4 && eventQuantity >= 0) {
			ticketSales.setQuantity(newQuantity);
			ticketSales.getEvent().setTotalTickets(eventQuantity);
			repository.save(ticketSales);
			return repository.findAll();
		} else {
			return repository.findAll();
		}
	}
	
}
