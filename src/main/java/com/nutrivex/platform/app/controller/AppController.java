package com.nutrivex.platform.app.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
		
	@GetMapping(value={"/", "", "/login"})
	public String index() {
		return "login";
	}
}
