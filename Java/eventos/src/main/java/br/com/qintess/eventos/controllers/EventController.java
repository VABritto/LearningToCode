package br.com.qintess.eventos.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import br.com.qintess.eventos.dados.ConcertHallRepository;
import br.com.qintess.eventos.dados.EventRepository;
import br.com.qintess.eventos.model.ConcertHall;
import br.com.qintess.eventos.model.Event;
import br.com.qintess.eventos.model.TicketSales;

@RestController
@RequestMapping("/api")
public class EventController {

	@Autowired
	private EventRepository repository;
	
	@Autowired
	private ConcertHallRepository concertHallRepository;
	
	@GetMapping("/event")
	public List<Event> getEvent() {
		return repository.findAll();
	}
	
	@PostMapping("/event/{concertHallId}")
	public List<Event> postEvent(@RequestBody Event event, 
			@PathVariable("concertHallId") Integer concertHallId) {
		ConcertHall concertHall = concertHallRepository.findById(concertHallId).orElse(new ConcertHall());
		event.setConcertHall(concertHall);
		repository.save(event);
		return repository.findAll();
	}
	
	@GetMapping("/event/{id}")
	public Event getEvent(@PathVariable(name = "id") Integer id) {
		return repository.findById(id).get();
	}
	
	@PutMapping("/event/{id}/image")
	public List<Event> putImage(@PathVariable("id") Integer id,
			@RequestParam(required = false, value = "image") MultipartFile image) 
							throws IOException {
		byte[] bImage;
		Event event = repository.findById(id).orElse(new Event());
		if(image != null && image.getSize() > 0) {
			bImage = image.getBytes();
			event.setEventImage(bImage);
		}
		repository.save(event);
		return repository.findAll();
	}
	
	@PutMapping("/event/{id}")
	public List<Event> putEvent(@RequestBody Event newEvent, @PathVariable(name = "id") Integer id) {
		
		Event event = repository.findById(id).orElse(new Event());
		
		if (newEvent.getName() != null) {
			event.setName(newEvent.getName());
		}
		if (newEvent.getStartDate() != null) {
			event.setStartDate(newEvent.getStartDate());
		}		
		if (newEvent.getEndDate() != null) {
			event.setEndDate(newEvent.getEndDate());
		}
		if (newEvent.getDescription() != null) {
			event.setDescription(newEvent.getDescription());
		}
		if (newEvent.getConcertHall() != null) {
			event.setConcertHall(newEvent.getConcertHall());
		}
		if (newEvent.getTickets() != null) {
			for(TicketSales ticket : newEvent.getTickets()) {
				event.addTicket(ticket);
			}
		}
		if (newEvent.getTicketPrice() != null) {
			event.setTicketPrice(newEvent.getTicketPrice());
		}
		if (newEvent.getTotalTickets() != null) {
			event.setTotalTickets(newEvent.getTotalTickets());
		}
		
		repository.save(event);
		return repository.findAll();
	}
	
	@DeleteMapping("/event/{id}")
	public List<Event> deleteEvent(@PathVariable(name = "id") Integer id) {
		Event event = repository.findById(id).orElse(new Event());
		ConcertHall concertHall = concertHallRepository.findById(event.getConcertHall().getId()).orElse(new ConcertHall());
		concertHall.removeEvent(event);
		repository.delete(event);
		return repository.findAll();
	}
}
