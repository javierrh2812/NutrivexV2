package com.nutrivex.platform.app.repository;


import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nutrivex.platform.app.models.Person;


public interface PersonRepository extends JpaRepository<Person, Long>{
	
	@Query("select p from Person p where p.users = ?1")
	public Collection<Person> listarNutricionistas();
	
	@Query("select p from Person p where p.firstName LIKE '%?1%'")
	public Collection<Person> listarNutricionistasBusquedaPorNombre(String str);

}
