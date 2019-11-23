package com.nutrivex.platform.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.nutrivex.platform.app.models.Role;
import com.nutrivex.platform.app.models.User;
import com.nutrivex.platform.app.service.PersonService;
import com.nutrivex.platform.app.service.UserService;



@Controller
@RequestMapping("/users")
@SessionAttributes("user")
public class UserController {

	@Autowired
	private PersonService personService;
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/new")
	public String newUser(Model model) {
		model.addAttribute("user", new User());
		return "signUps/signUpPatient";
	}
	
	@PostMapping(value = "/savePatient")
	public String saveUser(@Valid User user, BindingResult result, Model model, SessionStatus status) throws Exception {
		
		if (result.hasErrors()) {
			return "/login";
		} else {
			userService.createUser(user);
			//personService.createPerson(person);
			status.setComplete();
		}
		return "/login";
	}
	
	
	
}
