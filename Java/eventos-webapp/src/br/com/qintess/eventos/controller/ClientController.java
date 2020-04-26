package br.com.qintess.eventos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.qintess.eventos.dao.Dao;
import br.com.qintess.eventos.model.Client;
import br.com.qintess.eventos.model.Role;

@Controller
@RequestMapping("/clients")
public class ClientController {

	@Autowired
	private Dao dao;
	
	@RequestMapping("")
	public String view(Model model) {
		model.addAttribute("client", new Client());
		List<Client> clients = dao.getAll(Client.class);
		model.addAttribute("clients", clients);
		return "clients";
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
	
	@RequestMapping("/saveMerge")
	public String saveMerge(@ModelAttribute Client client,
			@RequestParam(required = false, value="cancel") String cancel,
			RedirectAttributes redirectAtt) {
		try {
			if(cancel != null) {
				return "redirect:/clients";
			}
			
			if(client.getId() == 0) {
				saveNewClient(client);
				redirectAtt.addFlashAttribute("successMessage", "Cliente registrado(a) com sucesso!");
			} else {
				dao.merge(client);
				redirectAtt.addFlashAttribute("successMessage", "Cliente alterado(a) com sucesso!");
			}
		} catch (Exception e) {
			redirectAtt.addFlashAttribute("errorMessage", "ERRO GRAVE: " + e.getMessage());
		}
		
		return "redirect:/clients";
	}
	
	@RequestMapping("/remove/{id}")
	public String remove(@PathVariable(name = "id") int id, RedirectAttributes redirectAtt) {
		Client client = dao.getById(Client.class, id);
		dao.remove(client);
		redirectAtt.addFlashAttribute("successMessage", "Cliente removido(a) com successo!");
		return "redirect:/clients";
	}
	
	@RequestMapping("/mergeView/{id}")
	public String mergeView(@PathVariable(name = "id") int id, Model model, 
			RedirectAttributes redirectAtt) {
		try {
			Client client = dao.getById(Client.class, id);
			
			model.addAttribute("clients", dao.getAll(Client.class));
			model.addAttribute("client", client);
		} catch (Exception e) {
			redirectAtt.addFlashAttribute("errorMessage", "ERRO GRAVE: " + e.getMessage());
		}
		return "clients";
	}
	
}
