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

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String email;
	
//	@Column(nullable = false)
//	private String password;
	
	@Column
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthdate;
	
//	@Column(nullable = false)
//	private String role;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<TicketSales> events = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "owner", fetch = FetchType.EAGER)
	private List<ConcertHall> concertHalls = new ArrayList<>();
	
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
//	@LazyCollection(LazyCollectionOption.FALSE)
//	private List<Role> roles;
	
	public void addConcertHall(ConcertHall concertHall) {
		concertHalls.add(concertHall);
	}
	
	public void removeConcertHall(ConcertHall concertHall) {
		concertHalls.remove(concertHall);
	}
	
	public void addEventTicket(TicketSales eventTicket) {
		events.add(eventTicket);
	}
	
	public void removeEventTicket(int id) {
		events.remove(id);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	public String getPassword() {
//		return password;
//	}

//	public void setPassword(String password) {
//		this.password = password;
//	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

//	public String getRole() {
//		return role;
//	}

//	public void setRole(String role) {
//		this.role = role;
//	}

	public List<TicketSales> getEvents() {
		return events;
	}

	public void setEvents(List<TicketSales> events) {
		this.events = events;
	}

	public List<ConcertHall> getConcertHalls() {
		return concertHalls;
	}

	public void setConcertHalls(List<ConcertHall> concertHalls) {
		this.concertHalls = concertHalls;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthdate == null) ? 0 : birthdate.hashCode());
		result = prime * result + ((concertHalls == null) ? 0 : concertHalls.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((events == null) ? 0 : events.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (birthdate == null) {
			if (other.birthdate != null)
				return false;
		} else if (!birthdate.equals(other.birthdate))
			return false;
		if (concertHalls == null) {
			if (other.concertHalls != null)
				return false;
		} else if (!concertHalls.equals(other.concertHalls))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (events == null) {
			if (other.events != null)
				return false;
		} else if (!events.equals(other.events))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				", birthdate=" + birthdate +
				", events=" + events +
				", concertHalls=" + concertHalls +
				'}';
	}

	//	public List<Role> getRoles() {
//		return roles;
//	}
//
//	public void setRoles(List<Role> roles) {
//		this.roles = roles;
//	}
	
	
}
