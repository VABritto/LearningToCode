package br.com.qintess.eventos.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
	
	@Column(nullable = false)
	private String name;
	
	@Column()
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private LocalDateTime startDate;
	
	@Column()
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private LocalDateTime endDate;
	
	@Column(nullable = false, length = 2000)
	private String description;
	
	@Lob
	@Column(columnDefinition = "mediumblob")
	private byte[] eventImage;
	
	@Transient
	private String encodedImage;
	
	@ManyToOne
	private ConcertHall concertHall;
	
	@OneToMany(mappedBy = "event")
	private List<TicketSales> tickets = new ArrayList<>();
	
	@Column(nullable = false)
	private Double ticketPrice;
	
	@Column(nullable = false)
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

	public byte[] getEventImage() {
		return eventImage;
	}

	public void setEventImage(byte[] eventImage) {
		this.eventImage = eventImage;
	}

	public String getEncodedImage() {
		return encodedImage;
	}

	public void setEncodedImage(String encodedImage) {
		this.encodedImage = encodedImage;
	}

	@JsonIgnore
	public ConcertHall getConcertHall() {
		return concertHall;
	}

	public void setConcertHall(ConcertHall concertHall) {
		this.concertHall = concertHall;
	}

	public List<TicketSales> getTickets() {
		return tickets;
	}

	public void setTickets(List<TicketSales> tickets) {
		this.tickets = tickets;
	}
	
	public void addTicket(TicketSales ticket) {
		this.tickets.add(ticket);
	}
	
	public void removeTicket(TicketSales ticket) {
		this.tickets.remove(ticket);
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((concertHall == null) ? 0 : concertHall.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((encodedImage == null) ? 0 : encodedImage.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + Arrays.hashCode(eventImage);
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((ticketPrice == null) ? 0 : ticketPrice.hashCode());
		result = prime * result + ((tickets == null) ? 0 : tickets.hashCode());
		result = prime * result + ((totalTickets == null) ? 0 : totalTickets.hashCode());
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
		Event other = (Event) obj;
		if (concertHall == null) {
			if (other.concertHall != null)
				return false;
		} else if (!concertHall.equals(other.concertHall))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (encodedImage == null) {
			if (other.encodedImage != null)
				return false;
		} else if (!encodedImage.equals(other.encodedImage))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (!Arrays.equals(eventImage, other.eventImage))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (ticketPrice == null) {
			if (other.ticketPrice != null)
				return false;
		} else if (!ticketPrice.equals(other.ticketPrice))
			return false;
		if (tickets == null) {
			if (other.tickets != null)
				return false;
		} else if (!tickets.equals(other.tickets))
			return false;
		if (totalTickets == null) {
			if (other.totalTickets != null)
				return false;
		} else if (!totalTickets.equals(other.totalTickets))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", name=" + name + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", description=" + description + ", eventImage=" + Arrays.toString(eventImage) + ", encodedImage="
				+ encodedImage + ", concertHall=" + concertHall.getId() + ", tickets=" + tickets + ", ticketPrice="
				+ ticketPrice + ", totalTickets=" + totalTickets + "]";
	}
	
	

}