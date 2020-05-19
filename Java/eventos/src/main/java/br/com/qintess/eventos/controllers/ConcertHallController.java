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
import br.com.qintess.eventos.dados.UserRepository;
import br.com.qintess.eventos.model.ConcertHall;
import br.com.qintess.eventos.model.Event;
import br.com.qintess.eventos.model.User;

@RestController
@RequestMapping("/api")
public class ConcertHallController {

	@Autowired
	private ConcertHallRepository repository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private EventRepository eventRepository;
	
	@GetMapping("/concertHall")
	public List<ConcertHall> getConcertHall() {
		return repository.findAll();
	}
	
	@PostMapping("/concertHall/{ownerId}")
	public List<ConcertHall> postConcertHall(@RequestBody ConcertHall concertHall, 
			@PathVariable("ownerId") Integer ownerId) {
		User owner = userRepository.findById(ownerId).orElse(new User());
		concertHall.setOwner(owner);
		repository.save(concertHall);
		return repository.findAll();
	}
	
	
	@GetMapping("/concertHall/{id}")
	public ConcertHall getConcertHall(@PathVariable(name = "id") Integer id) {
		return repository.findById(id).get();
	}
	
	@PutMapping("/concertHall/{id}/image")
	public List<ConcertHall> putImage(@PathVariable("id") Integer id,
			@RequestParam(required = false, value = "image") MultipartFile image) 
							throws IOException {
		byte[] bImage;
		ConcertHall concertHall = repository.findById(id).orElse(new ConcertHall());
		if(image != null && image.getSize() > 0) {
			bImage = image.getBytes();
			concertHall.setConcertHallImage(bImage);
		}
		repository.save(concertHall);
		return repository.findAll();
	}
	
	@PutMapping("/concertHall/{id}")
	public List<ConcertHall> putConcertHall(@RequestBody ConcertHall newConcertHall, @PathVariable(name = "id") Integer id) {
		
		ConcertHall concertHall = repository.findById(id).orElse(new ConcertHall());
		
		if (newConcertHall.getName() != null) {
			concertHall.setName(newConcertHall.getName());
		}
		if (newConcertHall.getAddress() != null) {
			concertHall.setAddress(newConcertHall.getAddress());
		}		
		if (newConcertHall.getCapacity() != null) {
			concertHall.setCapacity(newConcertHall.getCapacity());
		}
		if (newConcertHall.getEvents() != null) {
			for(Event event : newConcertHall.getEvents()) {
				concertHall.addEvent(event);
			}
		}
		if (newConcertHall.getOwner() != null) {
			concertHall.setOwner(newConcertHall.getOwner());
		}
		
		repository.save(concertHall);
		return repository.findAll();
	}
	
	@PutMapping("/concertHall/{id}/remove-event/{eventId}")
	public List<ConcertHall> removeEvent(@PathVariable(name = "id") Integer id, 
									@PathVariable(name = "eventId") Integer eventId) {
		ConcertHall concertHall = repository.findById(id).orElse(new ConcertHall());
		Event event = eventRepository.findById(eventId).orElse(new Event());
		concertHall.getEvents().removeIf(e -> e.equals(event));
		eventRepository.delete(event);
		repository.save(concertHall);
		return repository.findAll();
	}
	
	@DeleteMapping("/concertHall/{id}")
	public List<ConcertHall> deleteConcertHall(@PathVariable(name = "id") Integer id) {
		ConcertHall concertHall = repository.findById(id).orElse(new ConcertHall());
		User user = userRepository.findById(concertHall.getOwner().getId()).orElse(new User());
		user.removeConcertHall(concertHall);
		repository.delete(concertHall);
		return repository.findAll();
	}
}
