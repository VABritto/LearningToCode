package br.com.qintess.eventos.controllers;

import br.com.qintess.eventos.dados.ConcertHallRepository;
import br.com.qintess.eventos.dados.EventRepository;
import br.com.qintess.eventos.model.ConcertHall;
import br.com.qintess.eventos.model.Event;
import br.com.qintess.eventos.model.TicketSales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Table;
import java.util.List;

@RestController
@RequestMapping("/api")
@Table(name = "events")
public class EventController {

	@Autowired
	private EventRepository repository;
	
	@Autowired
	private ConcertHallRepository concertHallRepository;

	@GetMapping("/event")
	public List<Event> getEvent() {
		return repository.findAll();
	}

	@GetMapping("/event/{id}")
	public Event getEvent(@PathVariable(name = "id") Integer id) {
		return repository.findById(id).get();
	}

	@GetMapping("/event/search/findByNameContaining")
	public List<Event> getByNameContaining(@RequestParam("name") String name) {
		return repository.findByNameContainingIgnoreCase(name);
	}

	@PostMapping("/event/{concertHallId}")
	public List<Event> postEvent(@RequestBody Event event,
			@PathVariable("concertHallId") Integer concertHallId) {
		ConcertHall concertHall = concertHallRepository.findById(concertHallId).orElse(new ConcertHall());
		event.setConcertHall(concertHall);
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
		if (newEvent.getTicketPrice() != null) {
			event.setTicketPrice(newEvent.getTicketPrice());
		}
		if (newEvent.getTotalTickets() != null) {
			event.setTotalTickets(newEvent.getTotalTickets());
		}
		if (newEvent.getEventImage() != null) {
			event.setEventImage(newEvent.getEventImage());
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
