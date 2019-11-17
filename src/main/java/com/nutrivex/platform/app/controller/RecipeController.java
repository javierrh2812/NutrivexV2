package com.nutrivex.platform.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.nutrivex.platform.app.models.Person;

@Controller
@RequestMapping("/recipe")
@SessionAttributes("recipe")
public class RecipeController {
public static Person sessionUser;
	
	@GetMapping("/list")
	public String listRecipes() {
		return null;
	}
	
	
	@GetMapping("/new")
	public String newRecipe() {
		return null;
	}
	
	@PostMapping("/save")
	public String saveRecipe() {
		return null;
	}
}
