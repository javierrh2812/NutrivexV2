package com.nutrivex.platform.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nutrivex.platform.app.service.NutritionPlanService;

@Controller
public class NutritionPlanController {
	/ /need to correct errors
	private NutritionPlanService nps;
	
	@GetMapping(value="/NutritionalPlan")
	public String listNutritionPlans(Model model) {
		
		return "/plannutritionList";
	}

	@GetMapping(value="/nutrition_plans")
	public String listRequestsByNutritionId(@RequestParam Long id_nut, Model model) {
		try {
			//model.addAttribute("nutriotionalPlans", nps.getNutritionPlanByPatientId(id_nut));
		}catch(Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return "requests/list";
	}
}
