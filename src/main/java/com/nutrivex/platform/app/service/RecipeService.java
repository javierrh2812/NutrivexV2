package com.nutrivex.platform.app.service;

import java.util.List;

import com.nutrivex.platform.app.models.Recipe;

public interface RecipeService {
	
	public abstract int createRecipe(Recipe recipe);
	
	public abstract int updateRecipe(Long id, Recipe recipe);
	
	public abstract int deleteRecipe(Long id);
		
	public abstract Recipe findRecipeByNutritionistId(Long id_nutr);
	
	public abstract List<Recipe> findRecipesByNutritionistId(Long id_nutr);

}
