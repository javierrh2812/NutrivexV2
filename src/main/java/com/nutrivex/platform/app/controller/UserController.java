package com.nutrivex.platform.app.controller;

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

import com.nutrivex.platform.app.models.Person;
import com.nutrivex.platform.app.models.Role;
import com.nutrivex.platform.app.models.User;
import com.nutrivex.platform.app.service.PersonService;
import com.nutrivex.platform.app.service.RoleService;
import com.nutrivex.platform.app.service.UserService;



@Controller
@RequestMapping("/users")
@SessionAttributes("user")
public class UserController {

	public static Person sessionUser;
	
	@Autowired
	private PersonService personService;
	
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/new")
	public String newUser(Model model) {
		model.addAttribute("user", new User());
		return "signUps/signUpPatient";
	}
	/*
	@GetMapping(value = "/new2")
	public String newPerson(Model model) {
		model.addAttribute("person", new Person());
		return "signUps/signUpPatientFinal";
	}
	*/
	@PostMapping(value = "/savePatient")
	public String saveUser(@Valid User user ,BindingResult result, Model model, SessionStatus status) throws Exception {
		
		if (result.hasErrors()) {
			return "/login";
		} else {
			
			userService.createUser(user);
			//personService.createPerson(person);
			status.setComplete();
		}
		//Long id_par = userService.getLastValue();
		//userService.userDataPatient(id_par);
		model.addAttribute("person", new Person());
		return "signUps/signUpPatientFinal";
	}
	
	@PostMapping(value = "/savePatient2")
	@Transactional
	public String saveUser2(@Valid Person person, BindingResult result, Model model, SessionStatus status) throws Exception {
		
		//User pat = personService.findPerson((long)2).getUser();
		//userService.getLastValue();
		
		if (result.hasErrors()) {
			return "/login";
		} else {
			
			personService.createPerson(person);
			//personService.createPerson(person);
			status.setComplete();
		}
		//Long id_par = pat.getRole().getId();
		//userService.userDataPatient(id_par);
		return "/login";
	}
	
	
}
