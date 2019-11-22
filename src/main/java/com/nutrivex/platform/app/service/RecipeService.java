package com.nutrivex.platform.app.service;

import java.util.Collection;

import com.nutrivex.platform.app.models.Recipe;

public interface RecipeService extends CrudService<Recipe>{
	
	/*public void save(Recipe recipe);
	public void delete(Long id);
	public void update(Long id, Recipe recipe);
	public Recipe findOne(Long id);	*/
	public Collection<Recipe> fetchRecipesByNutritionistId(Long id);
	public Collection<Recipe> fetchRecipesByName(String name) throws Exception;
	

}
