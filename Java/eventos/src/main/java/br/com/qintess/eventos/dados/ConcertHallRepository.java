package br.com.qintess.eventos.dados;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.qintess.eventos.model.ConcertHall;

public interface ConcertHallRepository extends JpaRepository<ConcertHall, Integer> {

}