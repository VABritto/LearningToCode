package br.com.qintess.eventos.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private LocalDateTime startDate;
	
	@Column(nullable = false)
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private LocalDateTime endDate;
	
	@Column(nullable = false, length = 2000)
	private String description;
	
	@Lob
	@Column(nullable = false, columnDefinition = "mediumblob")
	private byte[] eventImage;
	
	@Transient
	private String encodedImage;
	
	@ManyToOne
	@JoinColumn(name = "concertHall_id", nullable = false)
	private ConcertHall concertHall;
	
	@OneToMany(mappedBy = "event")
	private List<TicketSales> tickets = new ArrayList<>();
	
	@Column(nullable = false)
	private double ticketPrice;
	
	@Column(nullable = false)
	private int totalTickets;

	
	
}
