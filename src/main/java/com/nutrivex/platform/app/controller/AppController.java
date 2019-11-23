package com.nutrivex.platform.app.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {
		
	@GetMapping(value={"/", "", "/login"})
	public String index() {
		return "login";
	}
	
	@PostMapping(value={"/logout"})
	public String logout() {
		return "login";
	}
}
