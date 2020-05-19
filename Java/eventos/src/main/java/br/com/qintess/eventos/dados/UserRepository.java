package br.com.qintess.eventos.dados;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.qintess.eventos.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
