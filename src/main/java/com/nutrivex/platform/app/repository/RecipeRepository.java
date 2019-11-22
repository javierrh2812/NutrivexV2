package com.nutrivex.platform.app.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nutrivex.platform.app.models.Recipe;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
	
	@Query("Select r from Recipe r where r.nutritionist.id=?1")
	public Collection<Recipe> fetchRecipesByNutritionistId(Long id);
	
	@Query("SELECT r FROM Recipe r WHERE r.name LIKE %?1%")
	public Collection<Recipe> fetchRecipesByName(String name);
	
	//@Query("SELECT r FROM Recipe r JOIN FETCH r.nutritionist n LEFT JOIN FETCH r.foods f WHERE r.id = ?1")
	//public Optional<Recipe> fetchRecipeByIdWithNutritionistWithFoods(Long id);
	
}
