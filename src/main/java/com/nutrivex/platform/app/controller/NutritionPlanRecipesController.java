package com.nutrivex.platform.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NutritionPlanRecipesController {
	
	@GetMapping(value="/NutritionalPlan")
	public String listNutritionPlans(Model model) {
		return "/plannutritionList";
	}
}
