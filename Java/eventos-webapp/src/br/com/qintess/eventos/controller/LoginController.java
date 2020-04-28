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
	public String signUpView(Model model) {
		System.out.println("------------------- signUpView entrado");
		model.addAttribute("client", new Client());
		System.out.println("------------------- Modelo cliente criado");
		return "signUp";
	}
	
	@RequestMapping("/doSignUp")
	public String doSignUp(@ModelAttribute Client client, RedirectAttributes redirectAtt,
							HttpServletRequest req) {
		System.out.println("------------------- doSignUp entrado");
		String originalPassword = client.getPassword();
		System.out.println("------------------- Senha original: " + originalPassword);
		try {
			System.out.println("------------------- Entrei no try");
			dao.getAll(Client.class)
				.stream().filter(c -> c.getEmail().equals(client.getEmail())).findFirst().get();
			
			redirectAtt.addFlashAttribute("errorMessage", "Usuário já cadastrado no sistema.");
			return "redirect:/login";
			
		} catch (Exception e) {
			//TODO 
			System.out.println("------------------- Passei pelo catch ");
		}
		
		saveNewClient(client);
		System.out.println("------------------- Saí do saveNewClient ");
		UsernamePasswordAuthenticationToken authToken = 
				new UsernamePasswordAuthenticationToken(client.getEmail(), originalPassword);
		
		Authentication authentication = authenticationManager.authenticate(authToken);
		
		SecurityContextHolder.getContext().setAuthentication(authentication);
		
		return "redirect:/";
	}

	private void saveNewClient(Client client) {
		System.out.println("------------------- saveNewClient entrado");
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode(client.getPassword());
		client.setPassword(hashedPassword);
		System.out.println("------------------- Nome do cliente: " + client.getName());
		System.out.println("------------------- Role do cliente: " + client.getRole());
		dao.save(client);
		System.out.println("------------------- Salvei no Dao");
		List<Role> roles = new ArrayList<Role>();
		Role role = new Role();
		System.out.println("------------------- Criei novo Role");
		role.setName("USER");
		if(client.getName().equals("admin")) {
			role.setName("ADMIN");
		} else if (client.getRole().equals("owner")) {
			role.setName("OWNER");
			System.out.println("------------------- Coloquei o role como OWNER");
		}
		
		role.setClient(client);
		System.out.println("------------------- Coloquei o cliente no role");
		roles.add(role);
		System.out.println("------------------- adicionei o role aos meus roles");
		
		dao.save(role);
		System.out.println("------------------- Salvei o role na dao");
	}
	
}
