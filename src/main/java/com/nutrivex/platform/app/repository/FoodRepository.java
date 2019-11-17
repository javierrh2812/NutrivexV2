package com.nutrivex.platform.app.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nutrivex.platform.app.models.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food,Long> {
	
	@Query("select f from Food f where f.recipe_id =?1")
	public Collection<Food> findFoodsByRecipeId(Long id_rec);
	
	@Query("select f from Food f where f.id =?1")
	public Food findFoodById(Long id);
}
