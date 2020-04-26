package br.com.qintess.eventos.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class TicketSales {

	@EmbeddedId
	private TicketSalesId id;
	
	private int quantity;
	
	public TicketSales() {}

	public TicketSales(Event event, Client client, int quantity) {
		this.id = new TicketSalesId(event, client);
		this.quantity = quantity;
	}

	public TicketSalesId getId() {
		return id;
	}

	public void setId(TicketSalesId id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + quantity;
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
		TicketSales other = (TicketSales) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}
	
}
