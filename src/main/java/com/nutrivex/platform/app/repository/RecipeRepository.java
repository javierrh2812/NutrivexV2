package com.nutrivex.platform.app.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nutrivex.platform.app.models.Recipe;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
	
	@Query("Select r from Recipe r where r.template_id =?1")
	public Collection<Recipe> findRecipesByTemplateId(Long id_templ);
	
	@Query("Select r from Recipe r where r.id =?1")
	public Recipe findRecipeById(Long id_rec);
}
