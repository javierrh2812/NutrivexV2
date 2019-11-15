package com.nutrivex.platform.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.nutrivex.platform.app.models.Person;

@Controller
@RequestMapping("/template")
@SessionAttributes("template")
public class TemplateController {
	public static Person sessionUser;
	
	@GetMapping("/list")
	public String listTemplates() {
		return null;
	}
	
	
	@GetMapping("/new")
	public String newTemplate() {
		return null;
	}
	
	@PostMapping("/save")
	public String saveTemplate() {
		return null;
	}

}
