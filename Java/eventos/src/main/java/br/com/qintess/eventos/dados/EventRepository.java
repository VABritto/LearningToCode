package br.com.qintess.eventos.dados;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.qintess.eventos.model.Event;

public interface EventRepository extends JpaRepository<Event, Integer> {

}
