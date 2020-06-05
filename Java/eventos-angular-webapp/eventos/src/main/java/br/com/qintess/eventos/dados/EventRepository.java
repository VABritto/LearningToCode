package br.com.qintess.eventos.dados;

import br.com.qintess.eventos.model.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@RepositoryRestResource(collectionResourceRel = "events", path = "event")
public interface EventRepository extends JpaRepository<Event, Integer> {

    public List<Event> findByNameContainingIgnoreCase(String name);
}
