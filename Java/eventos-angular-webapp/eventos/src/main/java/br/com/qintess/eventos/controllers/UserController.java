package br.com.qintess.eventos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.qintess.eventos.dados.ConcertHallRepository;
import br.com.qintess.eventos.dados.UserRepository;
import br.com.qintess.eventos.model.ConcertHall;
import br.com.qintess.eventos.model.TicketSales;
import br.com.qintess.eventos.model.User;

import javax.persistence.Table;

@RestController
@RequestMapping("/api")
@Table(name = "users")
public class UserController {

	@Autowired
	private UserRepository repository;
	
	@Autowired
	private ConcertHallRepository concertHallRepository;
	
	@GetMapping("/user")
	public List<User> getUsers() {
		return repository.findAll();
	}
	
	@PostMapping("/user")
	public List<User> postUser(@RequestBody User user) {
		repository.save(user);
		return repository.findAll();
	}
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable(name = "id") Integer id) {

		System.out.println("----------- Entrei no método get do user");

		return repository.findById(id).get();
	}
	
	@PutMapping("/user/{id}/remove-concertHall/{concertHallId}")
	public List<User> removeConcertHall(@PathVariable(name = "id") Integer id, 
									@PathVariable(name = "concertHallId") Integer concertHallId) {
		User user = repository.findById(id).orElse(new User());
		ConcertHall concertHall = concertHallRepository.findById(concertHallId).orElse(new ConcertHall());
		user.getConcertHalls().removeIf(cH -> cH.equals(concertHall));
		concertHallRepository.delete(concertHall);
		repository.save(user);
		return repository.findAll();
	}
	
	@PutMapping("/user/{id}")
	public User putUser(@RequestBody User newUser, @PathVariable(name = "id") Integer id) {
		
		User user = repository.findById(id).orElse(new User());
		
		if (newUser.getName() != null) {
			user.setName(newUser.getName());
		}
		if (newUser.getEmail() != null) {
			user.setEmail(newUser.getEmail());
		}		
		if (newUser.getBirthdate() != null) {
			user.setBirthdate(newUser.getBirthdate());
		}
		if (newUser.getEvents() != null) {
			for(TicketSales eventTicket : newUser.getEvents()) {
				user.addEventTicket(eventTicket);
			}
		}
		if (newUser.getConcertHalls() != null) {
			for(ConcertHall concertHall : newUser.getConcertHalls()) {
				user.addConcertHall(concertHall);
			}
		}
		
		return repository.save(user);
	}
	
	@DeleteMapping("/user/{id}")
	public List<User> deleteUser(@PathVariable(name = "id") Integer id) {
		repository.deleteById(id);
		return repository.findAll();
	}
	
	@PutMapping("/user/{idUser}/concertHall/{idConcertHall}")
	public List<User> putConcertHall(@RequestBody User newUser, 
			@PathVariable(name = "idUser") Integer idUser,
			@PathVariable(name = "idConcertHall") Integer idConcertHall) {
		ConcertHall concertHall = concertHallRepository.findById(idConcertHall).orElse(new ConcertHall());
		User user = repository.findById(idUser).orElse(new User());
		if (concertHall != null) {
			user.addConcertHall(concertHall);
		}
		
		repository.save(user);
		return repository.findAll();
	}
	
}
