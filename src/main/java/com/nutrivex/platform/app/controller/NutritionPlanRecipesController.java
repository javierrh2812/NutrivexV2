package com.nutrivex.platform.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nutrivex.platform.app.service.NutritionPlanService;

@Controller
public class NutritionPlanRecipesController {
	
	private NutritionPlanService nps;
	
	@GetMapping(value="/NutritionalPlan")
	public String listNutritionPlans(Model model) {
		return "/plannutritionList";
	}
}
