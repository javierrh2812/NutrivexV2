package com.nutrivex.platform.app.controller;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nutrivex.platform.app.models.Person;
import com.nutrivex.platform.app.models.Recipe;
import com.nutrivex.platform.app.models.User;
import com.nutrivex.platform.app.service.PersonService;
import com.nutrivex.platform.app.service.RecipeService;

@Controller
@RequestMapping("/recipe")
@SessionAttributes("recipe")
public class RecipeController {

	public static Person sessionUser;

	@Autowired
	private RecipeService recipeService;

	@Autowired
	private PersonService personService;
	
	@GetMapping(value = "/list/{name}", produces = { "application/json" })
	public @ResponseBody List<Recipe> fetchRecipes(@PathVariable String name, Model model) {
		List<Recipe> recipes = null;
		try {
			recipes = (List<Recipe>) recipeService.fetchRecipesByName(name);
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}
		return recipes;
	}
	
	@GetMapping("/list")
	public String listRecipes(@RequestParam Long id_nut, Model model) {
		
		User nutri = personService.findPerson(id_nut).getUser(); 
		model.addAttribute("sessionUser", nutri.getPerson());		
		try {
			if (recipeService.fetchRecipesByNutritionistId(id_nut) == null) {				
				model.addAttribute("message", "Aun no tienes ninguna receta");
			} else {
				model.addAttribute("recipes", recipeService.fetchRecipesByNutritionistId(id_nut));
			}
			model.addAttribute("title", "Recetas");
			return "/recipe/list";
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
			return "/nutritionist/menu";
		}
	}
	
	
	@GetMapping(value = "/new")
	public String newRecipe(@RequestParam Long id, Model model, RedirectAttributes flash) {

		sessionUser = personService.findPerson(id);
		User nutri = personService.findPerson(id).getUser();
		
		if (nutri == null) {
			return "redirect:nutritionist/menu";
		}
		
		Recipe recipe = new Recipe();
		recipe.setNutritionist(nutri);

		model.addAttribute("recipe", recipe);
		model.addAttribute("title", "Nueva receta");
		model.addAttribute("sessionUser", sessionUser);
		return "/recipe/new";
	}

	@PostMapping(value = "/save")
	public String saveRecipe(@Valid Recipe recipe, BindingResult result, Model model, SessionStatus status) throws Exception {
		
		model.addAttribute("sessionUser", sessionUser);
		
		if (result.hasErrors()) {
			return "/recipe/new";
		} else {
			recipeService.save(recipe);
			model.addAttribute("message", "Receta agregada!");
			model.addAttribute("recipes", recipeService.fetchRecipesByNutritionistId(recipe.getNutritionist().getId()));
			status.setComplete();
		}
		model.addAttribute("title", "Recetas");
		return "/recipe/list";
	}
	
	@GetMapping(value = "/delete")
	public String deleteRecipe(@RequestParam Long id, Model model, RedirectAttributes flash) throws Exception {

		recipeService.deleteById(id);
		
		model.addAttribute("title", "Recetas");
		model.addAttribute("message", "Receta eliminada");
		model.addAttribute("recipes", recipeService.fetchRecipesByNutritionistId(sessionUser.getId()));
		model.addAttribute("sessionUser", sessionUser);
		return "recipe/list";

		
	}

}
