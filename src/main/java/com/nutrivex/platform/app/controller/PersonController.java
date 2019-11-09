package com.nutrivex.platform.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nutrivex.platform.app.models.Person;
import com.nutrivex.platform.app.models.Request;
import com.nutrivex.platform.app.service.PersonService;
import com.nutrivex.platform.app.service.RequestService;

@Controller
public class PersonController {
	
	public static Person sessionUser;
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private RequestService requestService;
	
	@GetMapping(value= {"/menu"})
	public String index(@RequestParam Long id,Model model){
		
		sessionUser = personService.findPerson(id);
		
		if (sessionUser==null) return "login";
		model.addAttribute("sessionUser", sessionUser);
		model.addAttribute("message", "Bienvenido a Nutrivex!!");
		model.addAttribute("title", "Inicio");
		
		if (sessionUser.getUser().getRole().getId() == 1) return "nutritionist/menu";
		else return "patient/menu";
			
		
	}
	
	@GetMapping(value="/patient/nutritionists")
	public String listNutritionists(@RequestParam(required = false) String str, Model model){
		try {
			if(str == null) {
			model.addAttribute("nutris", personService.getNutritionists());
			
			} else {
			model.addAttribute("nutris", personService.getBúsquedaNutritionists(str));	
			}
			model.addAttribute("title", "Nutricionistas");
		}
		catch(Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		model.addAttribute("sessionUser", sessionUser);
		return "patient/nutritionistsList";
	}
	


	@GetMapping(value="/profileNutritionists")
	public String toProfilePatient() {
		return "/profileNutritionist";
	}
	
	@GetMapping(value="/profilePatients")
	public String toProfileNutritionist() {
		return "/profilePatient";
	}
	
	
	@GetMapping(value="/miplan")
	public String plan(@RequestParam Long id_pat, Model model){
		
		model.addAttribute("sessionUser", sessionUser);
		Request r = requestService.findRequestByPatientId(id_pat);
		try {
			if(r==null) {
			model.addAttribute("nutris", personService.getNutritionists());
			model.addAttribute("title", "Nutricionistas");
			model.addAttribute("message", "Aun no tienes un plan, solicita uno ahora mismo!");
				return "patient/nutritionistsList";
			}
			if(r.getAcepted()==null) {
				model.addAttribute("title", "Inicio");
				model.addAttribute("message", "Tu solicitud aún no ha sido respondida");
				return "patient/menu";
			}
			if(r.getAcepted()==true) {
				model.addAttribute("title", "Inicio");
				model.addAttribute("message", "En unos momentos tendrás tu plan nutricional");
				return "patient/menu";
			}
		}
			
		catch(Exception e) {
			model.addAttribute("error", e.getMessage());
			return "patient/menu";
		}
		
		return "patient/menu";
		
	}

}
