package br.com.qintess.eventos.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "clients")
@Getter @Setter
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String password;
	
	@Column
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthdate;
	
	@Column(nullable = false)
	private String role;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<TicketSales> events = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "owner", fetch = FetchType.EAGER)
	private List<ConcertHall> concertHalls = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Role> roles;
	
	public void addConcertHall(ConcertHall concertHall) {
		concertHalls.add(concertHall);
	}
	
	public void addEventTicket(TicketSales eventTicket) {
		events.add(eventTicket);
	}
	
}
