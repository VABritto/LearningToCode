package br.com.qintess.eventos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.qintess.eventos.dao.Dao;
import br.com.qintess.eventos.model.ConcertHall;

@Controller
@RequestMapping("/concertHall")
public class ConcertHallController {

	@Autowired
	private Dao dao;
	
	@RequestMapping("")
	public String view(Model model) {
		model.addAttribute("concertHall", new ConcertHall());
		List<ConcertHall> concertHalls = dao.getAll(ConcertHall.class);
		model.addAttribute("concertHalls", concertHalls);
		return "concertHall";
	}
	
	@RequestMapping("/saveMerge")
	public String saveMerge(@ModelAttribute ConcertHall concertHall,
			@RequestParam(required = false, value="cancel") String cancel,
			@RequestParam(required = false, value="image") MultipartFile image,
			RedirectAttributes redirectAtt) {
		byte[] bImage;
		try {
			if(cancel != null) {
				return "redirect:/concertHall";
			}
			
			if(image != null && image.getSize() > 0) {
				bImage = image.getBytes();
				concertHall.setConcertHallImage(bImage);
			}
			
			if(concertHall.getId() == 0) {
				dao.save(concertHall);
				redirectAtt.addFlashAttribute("successMessage", "Casa de Show registrada com sucesso!");
			} else {
				dao.merge(concertHall);
				redirectAtt.addFlashAttribute("successMessage", "Casa de Show alterada com sucesso!");
			}
		} catch (Exception e) {
			redirectAtt.addFlashAttribute("errorMessage", "ERRO GRAVE: " + e.getMessage());
		}
		
		return "redirect:/concertHall";
	}
	
	@RequestMapping("/remove/{id}")
	public String remove(@PathVariable(name = "id") int id, RedirectAttributes redirectAtt) {
		ConcertHall concertHall = dao.getById(ConcertHall.class, id);
		dao.remove(concertHall);
		redirectAtt.addFlashAttribute("successMessage", "Casa de Show removida com successo!");
		return "redirect:/concertHall";
	}
	
	@RequestMapping("/mergeView/{id}")
	public String mergeView(@PathVariable(name = "id") int id, Model model, 
			RedirectAttributes redirectAtt) {
		try {
			ConcertHall concertHall = dao.getById(ConcertHall.class, id);
			byte[] encodeBase64 = java.util.Base64.getEncoder().encode(concertHall.getConcertHallImage());
			String base64Encoded = new String(encodeBase64, "UTF-8");
			
			model.addAttribute("concertHalls", dao.getAll(ConcertHall.class));
			model.addAttribute("concertHall", concertHall);
			model.addAttribute("concertHallImage", base64Encoded);
		} catch (Exception e) {
			redirectAtt.addFlashAttribute("errorMessage", "ERRO GRAVE: " + e.getMessage());
		}
		return "concertHall";
	}
}
