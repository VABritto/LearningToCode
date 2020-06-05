package br.com.qintess.eventos.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@Column()
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private LocalDateTime startDate;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private LocalDateTime endDate;
	
	@Column(length = 2000)
	private String description;

	private String eventImage;
	
	@ManyToOne
	private ConcertHall concertHall;
	
	private Double ticketPrice;
	
	private Integer totalTickets;
	
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

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEventImage() {
		return eventImage;
	}

	public void setEventImage(String eventImage) {
		this.eventImage = eventImage;
	}

	public ConcertHall getConcertHall() {
		return concertHall;
	}

	public void setConcertHall(ConcertHall concertHall) {
		this.concertHall = concertHall;
	}

	public Double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public Integer getTotalTickets() {
		return totalTickets;
	}

	public void setTotalTickets(Integer totalTickets) {
		this.totalTickets = totalTickets;
	}

	public String getStartDateString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		String formattedStartDate = startDate.format(dtf);
		return formattedStartDate;
	}
	
	public String getEndDateString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		String formattedEndDate = endDate.format(dtf);
		return formattedEndDate;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Event event = (Event) o;
		return id == event.id &&
				Objects.equals(name, event.name) &&
				Objects.equals(startDate, event.startDate) &&
				Objects.equals(endDate, event.endDate) &&
				Objects.equals(description, event.description) &&
				Objects.equals(eventImage, event.eventImage) &&
				Objects.equals(concertHall, event.concertHall) &&
				Objects.equals(ticketPrice, event.ticketPrice) &&
				Objects.equals(totalTickets, event.totalTickets);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, startDate, endDate, description, eventImage, concertHall, ticketPrice, totalTickets);
	}

	@Override
	public String toString() {
		return "Event{" +
				"id=" + id +
				", name='" + name + '\'' +
				", startDate=" + startDate +
				", endDate=" + endDate +
				", description='" + description + '\'' +
				", eventImage='" + eventImage + '\'' +
				", concertHall=" + concertHall.getId() +
				", ticketPrice=" + ticketPrice +
				", totalTickets=" + totalTickets +
				'}';
	}
}