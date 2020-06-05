package br.com.qintess.eventos.dados;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.qintess.eventos.model.ConcertHall;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel= "concert_halls", path= "concertHall")
public interface ConcertHallRepository extends JpaRepository<ConcertHall, Integer> {

}