package com.nutrivex.platform.app.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.nutrivex.platform.app.models.Food;

public interface FoodRepository extends JpaRepository<Food,Long> {
	
	//@Query("select f from Food f where f.id =1")
	//public Collection<Food> listarComidasPorId();
	
	//@Query("select f from food f where f.name like %?1%")
	//public Food fetchByNameLike(String string);
}
