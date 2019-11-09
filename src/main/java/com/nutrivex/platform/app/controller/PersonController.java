package com.nutrivex.platform.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nutrivex.platform.app.models.Request;
import com.nutrivex.platform.app.service.PersonService;
import com.nutrivex.platform.app.service.RequestService;

@Controller
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private RequestService requestService;
	
	@GetMapping(value= {"/index", "", "/"})
	public String index(Model model){
		model.addAttribute("message", "Bienvenido a Nutrivex!!");
		model.addAttribute("title", "Inicio");
		return "/index";
	}
	
	@GetMapping(value="/nutritionists")
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
		return "/nutritionistsList";
	}
	
	@GetMapping(value="/nutritionist")
	public String changeToNutritionist() {
		return "layout/nutritionist";
	}
	
	@GetMapping(value="/patient")
	public String changeToPatient() {
		return "layout/patient";
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
		Request r = requestService.findRequestByPatientId(id_pat);
		try {
			if(r==null) {
			model.addAttribute("nutris", personService.getNutritionists());
			model.addAttribute("title", "Nutricionistas");
			model.addAttribute("message", "Aun no tienes un plan, solicita uno ahora mismo!");
				return "/nutritionistsList";
			}
			if(r.getAcepted()==null) {
				model.addAttribute("title", "Inicio");
				model.addAttribute("message", "Tu solicitud aún no ha sido respondida");
				return "/index";
			}
		}
			
		catch(Exception e) {
			model.addAttribute("error", e.getMessage());
			return "/index";
		}
		return "/index";
		
	}

}
