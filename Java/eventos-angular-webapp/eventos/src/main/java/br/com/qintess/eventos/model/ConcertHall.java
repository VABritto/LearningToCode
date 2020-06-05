package br.com.qintess.eventos.model;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ConcertHall {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String address;
	
	private Integer capacity;

	private String concertHallImage;

	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "concertHall", fetch = FetchType.EAGER)
	private List<Event> events;

	@ManyToOne
	private User owner;


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


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Integer getCapacity() {
		return capacity;
	}


	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}


	public String getConcertHallImage() {
		return concertHallImage;
	}


	public void setConcertHallImage(String concertHallImage) {
		this.concertHallImage = concertHallImage;
	}

	@JsonIgnore
	public User getOwner() {
		return owner;
	}


	public void setOwner(User owner) {
		this.owner = owner;
	}

	@JsonIgnore
	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}
	
	public void addEvent(Event event) {
		this.events.add(event);
	}
	
	public void removeEvent(Event event) {
		this.events.remove(event);
	}


	@Override
	public String toString() {
		return "ConcertHall [id=" + id + ", name=" + name + ", address=" + address + ", capacity=" + capacity
				+ ", events=" + events + ", owner=" + owner.getId() + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ConcertHall that = (ConcertHall) o;
		return id == that.id &&
				Objects.equals(name, that.name) &&
				Objects.equals(address, that.address) &&
				Objects.equals(capacity, that.capacity) &&
				Objects.equals(concertHallImage, that.concertHallImage) &&
				Objects.equals(events, that.events) &&
				Objects.equals(owner, that.owner);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, address, capacity, concertHallImage, events, owner);
	}
}