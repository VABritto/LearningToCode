package br.com.qintess.eventos.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.qintess.eventos.dao.Dao;
import br.com.qintess.eventos.model.Client;
import br.com.qintess.eventos.model.Role;

@Controller
public class LoginController {

	@Autowired
	private Dao dao;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@RequestMapping("/login")
	public String login(Model model) {
		return "login";
	}
	
	@RequestMapping("/signUpView")
	public String signUpView() {
		return "signUp";
	}
	
	@RequestMapping("/doSignUp")
	public String doSignUp(@ModelAttribute Client client, RedirectAttributes redirectAtt,
							HttpServletRequest req) {
	
		String originalPassword = client.getPassword();
		
		try {
			dao.getAll(Client.class)
				.stream().filter(c -> c.getEmail().equals(client.getEmail())).findFirst().get();
			
			redirectAtt.addFlashAttribute("errorMessage", "Usuário já cadastrado no sistema.");
			return "redirect:/login";
			
		} catch (Exception e) {
			//TODO
		}
		
		saveNewClient(client);
		
		UsernamePasswordAuthenticationToken authToken = 
				new UsernamePasswordAuthenticationToken(client.getEmail(), originalPassword);
		
		Authentication authentication = authenticationManager.authenticate(authToken);
		
		SecurityContextHolder.getContext().setAuthentication(authentication);
		
		return "redirect:/";
	}

	private void saveNewClient(Client client) {
		
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode(client.getPassword());
		client.setPassword(hashedPassword);
		
		dao.save(client);
		
		List<Role> roles = new ArrayList<Role>();
		Role role = new Role();
		
		role.setName("USER");
		if(client.getName().equals("admin")) {
			role.setName("ADMIN");
		} else if (client.getRole().equals("owner")) {
			role.setName("OWNER");
		}
		
		role.setClient(client);
		roles.add(role);
		
		dao.save(role);
		
	}
	
}
