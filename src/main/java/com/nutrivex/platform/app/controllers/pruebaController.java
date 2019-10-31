package com.nutrivex.platform.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pruebaController {
	@GetMapping(value="/")
	public String inicioPrueba() {
		return "index";
	} 
}
