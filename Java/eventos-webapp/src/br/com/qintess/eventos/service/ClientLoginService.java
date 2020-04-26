package br.com.qintess.eventos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.qintess.eventos.dao.Dao;
import br.com.qintess.eventos.model.Client;

@Service
public class ClientLoginService implements UserDetailsService {

	@Autowired
	private Dao dao;

	@Override
	public UserDetails loadUserByUsername(String username) {
		
		Client client = null;
		UserBuilder builder = null;
		
		try {
			
			client = dao.getAll(Client.class).stream().filter(c -> c.getEmail().equals(username))
					.findFirst().get();
			
			if(client != null) {
				builder = User.withUsername(username);
				builder.password(client.getPassword());
				String[] roles = client.getRoles().stream().map(c -> c.getName())
						.toArray(String[]::new);
				builder.roles(roles);
			}
			
		} catch (Exception e) {
			throw new UsernameNotFoundException("Usuário não encontrado.");
		}
		
		return builder.build();
	}
	
}
