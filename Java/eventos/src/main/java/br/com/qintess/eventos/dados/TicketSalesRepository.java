package br.com.qintess.eventos.dados;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.qintess.eventos.model.TicketSales;

public interface TicketSalesRepository extends JpaRepository<TicketSales, Integer> {

}
