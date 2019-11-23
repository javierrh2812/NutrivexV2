package com.nutrivex.platform.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nutrivex.platform.app.models.Recipe;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
	
	@Query("SELECT r FROM Recipe r WHERE r.nutritionist.id=?1")
	public List<Recipe> fetchRecipesByNutritionistId(Long id);
	
	@Query("SELECT r FROM Recipe r WHERE r.name=?1")
	public List<Recipe> fetchRecipesByName(String name);
	
	@Query("SELECT r FROM Recipe r JOIN FETCH r.nutritionist n WHERE r.name LIKE %?2% AND n.id=?1")
	public List<Recipe> fetchRecipesByNameAndByNutritionistId(Long id_nut, String term);
	
	public Recipe findByName(String name);
	
}
