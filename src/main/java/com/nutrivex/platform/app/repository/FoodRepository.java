package com.nutrivex.platform.app.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nutrivex.platform.app.models.Food;

public interface FoodRepository extends JpaRepository<Food,Long> {
	
	@Query("select f from Food f where f.id =1")
	public Collection<Food> listarComidasPorId();
}
