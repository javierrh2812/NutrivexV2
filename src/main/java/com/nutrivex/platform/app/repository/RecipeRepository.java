package com.nutrivex.platform.app.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nutrivex.platform.app.models.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
	
	@Query("Select r from Recipe r where r.id =1")
	public Collection<Recipe> listarRecetasporId();
}
