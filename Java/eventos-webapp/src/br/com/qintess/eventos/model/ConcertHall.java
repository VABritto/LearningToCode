package br.com.qintess.eventos.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class ConcertHall {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String address;
	
	@Column(nullable = false)
	private int capacity;
	
	@Lob
	@Column(nullable = false, columnDefinition = "mediumblob")
	private byte[] concertHallImage;
	
//	@Column(nullable = false)
//	private String email;
	
//	@Column(nullable = false, length = 15)
//	private String password;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "concertHall", fetch = FetchType.EAGER)
	private List<Event> events;

	@ManyToOne
	private Client owner;

	
}
