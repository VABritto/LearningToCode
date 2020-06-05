package br.com.qintess.eventos.dados;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.qintess.eventos.model.User;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel= "users", path= "user")
public interface UserRepository extends JpaRepository<User, Integer> {

}
