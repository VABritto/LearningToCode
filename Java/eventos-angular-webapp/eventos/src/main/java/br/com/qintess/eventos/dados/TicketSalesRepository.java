package br.com.qintess.eventos.dados;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.qintess.eventos.model.TicketSales;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel= "ticket_sales", path= "ticketSales")
public interface TicketSalesRepository extends JpaRepository<TicketSales, Integer> {

}
