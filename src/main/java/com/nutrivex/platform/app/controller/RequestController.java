package com.nutrivex.platform.app.controller;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nutrivex.platform.app.models.Person;
import com.nutrivex.platform.app.models.Request;
import com.nutrivex.platform.app.models.User;
import com.nutrivex.platform.app.service.PersonService;
import com.nutrivex.platform.app.service.RequestService;

@Controller
@RequestMapping("/request")
@SessionAttributes("request")
public class RequestController {
	
	public static Person sessionUser;
	
	@Autowired
	private RequestService requestService;

	@Autowired
	private PersonService personService;

	@GetMapping(value = "/new")
	public String newRequest(@RequestParam Long id_nutri, @RequestParam Long id_pat, Model model,
			RedirectAttributes flash) {

		sessionUser = personService.findPerson(id_pat);
		
		User nutri = personService.findPerson(id_nutri).getUser();
		User pat = personService.findPerson(id_pat).getUser();

		if (nutri == null || pat == null) {
			flash.addFlashAttribute("error", "El nutricionista o el paciente no existen en la BBDD");
			return "redirect:/menu";
		}
		
		Request request = new Request();
		request.setDate(new Date());
		request.setNutritionist(nutri);
		request.setPatient(pat);

		model.addAttribute("request", request);
		model.addAttribute("patient", pat.getPerson());
		model.addAttribute("title", "Solicitud de Plan");
		model.addAttribute("sessionUser", sessionUser);
		return "request/new";
	}

	@PostMapping(value = "/save")
	public String saveRequest(@Valid Request request, BindingResult result, Model model, SessionStatus status) {
		model.addAttribute("sessionUser", sessionUser);
		if (result.hasErrors()) {
			return "/request/new";
		} else {
			requestService.createRequest(request);
			model.addAttribute("message", "Solicitud enviada!");
			status.setComplete();
		}
		return "patient/menu";
	}

	@GetMapping("/list")
	public String listRequests(@RequestParam Long id_nut, Model model) {
		
		model.addAttribute("sessionUser", personService.findPerson(id_nut));		
		try {
			if (requestService.getRequestsByNutritionistId(id_nut) == null) {
				model.addAttribute("title", "Solicitudes");
				model.addAttribute("message", "Aun no tienes tienes ninguna solicitud");
				return "nutritionist/menu";
			} else {
				model.addAttribute("reques", requestService.getRequestsByNutritionistId(id_nut));
				return "/request/list";
			}
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
			return "nutritionist/menu";
		}
	}
	
	

	@GetMapping(value = "/stateAccepted")
	@Transactional
	public String stateAccept(@RequestParam Long id_nut, @RequestParam Long id_pat, Model model) {
		model.addAttribute("sessionUser", sessionUser);
		requestService.acceptingRequest(id_pat);
		return "request/list";
	}

	@GetMapping(value = "/stateRejected")
	@Transactional
	public String stateReject(@RequestParam Long id_nut, @RequestParam Long id_pat, Model model) {
		model.addAttribute("sessionUser", sessionUser);
		requestService.rejectingRequest(id_pat);
		return "request/list";
	}
	@GetMapping(value="/requests")
	public String listRequestsByNutritionId(@RequestParam Long id_nut, Model model) {
		try {
			model.addAttribute("Requests", requestService.getRequestsByNutritionistId(id_nut));
		}catch(Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return "request/list";
	}
}
