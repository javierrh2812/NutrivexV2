package com.nutrivex.platform.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nutrivex.platform.app.models.Recipe;
//import com.nutrivex.platform.app.repository.FoodRepository;
import com.nutrivex.platform.app.repository.RecipeRepository;
import com.nutrivex.platform.app.service.RecipeService;

@Service
public class RecipeServiceImpl implements RecipeService {

	//@Autowired
	//private FoodRepository foodRepository;
	
	@Autowired
	private RecipeRepository recipeRepository;
	
	@Override
	public List<Recipe> findAll() throws Exception {
		return recipeRepository.findAll();
	}

	@Override
	public void save(Recipe recipe) throws Exception {
		recipeRepository.save(recipe);
	}

	@Override
	public Optional<Recipe> findById(Long id) throws Exception {
		return recipeRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) throws Exception {
		recipeRepository.deleteById(id);
	}	
		
	@Override
	public List<Recipe> fetchRecipesByNutritionistId(Long id) throws Exception {
		return recipeRepository.fetchRecipesByNutritionistId(id);
	}

	@Override
	public List<Recipe> fetchRecipesByName(Long id_nut, String name) throws Exception {
		return recipeRepository.fetchRecipesByNameAndByNutritionistId(id_nut, name);
	}

	@Override
	public Recipe findByName(String name) throws Exception {
		return recipeRepository.findByName(name);
	}

	

	/*
	@Override
	public void save(Recipe recipe) {
		recipeRepository.save(recipe);
	}

	@Override
	public void delete(Long id) {
		if (recipeRepository.existsById(id)) recipeRepository.deleteById(id);
	}

	@Override
	public void update(Long id, Recipe recipe) {
		Recipe original = recipeRepository.findById(id).orElse(null);
		if (original!=null) {
			original.setName(recipe.getName());
			original.setDescription(recipe.getDescription());
			original.setFoods(recipe.getFoods());
		}
	}

	@Override
	public Recipe findOne(Long id) {
		return recipeRepository.findById(id).orElse(null);
	}
	
	public List<Food> getFoods(){
		return foodRepository.findAll();
	}*/

	
}
