package com.nutrivex.platform.app.service;

<<<<<<< HEAD
public interface RecipeService {
=======
import java.util.List;

import com.nutrivex.platform.app.models.Recipe;

public interface RecipeService extends CrudService<Recipe>{
	
	/*public void save(Recipe recipe);
	public void delete(Long id);
	public void update(Long id, Recipe recipe);
	public Recipe findOne(Long id);	*/
	public List<Recipe> fetchRecipesByNutritionistId(Long id)throws Exception;
	public List<Recipe> fetchRecipesByName(Long id_nut,String name) throws Exception;
	public Recipe findByName(String name) throws Exception; 
>>>>>>> 7287a2dcd533602f1afca19a0d858e0d1d834708

}
