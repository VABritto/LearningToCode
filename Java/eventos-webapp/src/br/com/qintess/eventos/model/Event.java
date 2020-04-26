package br.com.qintess.eventos.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
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
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate date;
	
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
	
	@OneToMany(mappedBy = "id.event")
	private List<TicketSales> tickets = new ArrayList<>();
	
	@Column(nullable = false)
	private double ticketPrice;
	
	@Column(nullable = false)
	private int totalTickets;

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

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
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

	public int getTotalTickets() {
		return totalTickets;
	}

	public void setTotalTickets(int totalTickets) {
		this.totalTickets = totalTickets;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public String getEncodedImage() {
		return encodedImage;
	}

	public void setEncodedImage(String encodedImage) {
		this.encodedImage = encodedImage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((concertHall == null) ? 0 : concertHall.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((encodedImage == null) ? 0 : encodedImage.hashCode());
		result = prime * result + Arrays.hashCode(eventImage);
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(ticketPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((tickets == null) ? 0 : tickets.hashCode());
		result = prime * result + totalTickets;
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
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
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
		if (!Arrays.equals(eventImage, other.eventImage))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(ticketPrice) != Double.doubleToLongBits(other.ticketPrice))
			return false;
		if (tickets == null) {
			if (other.tickets != null)
				return false;
		} else if (!tickets.equals(other.tickets))
			return false;
		if (totalTickets != other.totalTickets)
			return false;
		return true;
	}
	
}
