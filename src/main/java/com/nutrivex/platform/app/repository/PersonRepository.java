package com.nutrivex.platform.app.repository;


import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nutrivex.platform.app.models.Person;


public interface PersonRepository extends JpaRepository<Person, Long>{
	
	@Query("select p from Person p where p.user.role.id=1")
	public Collection<Person> listarNutricionistas();
	
	@Query("select p from Person p where p.firstName LIKE '%?1%'")
	public Collection<Person> listarNutricionistasBusquedaPorNombre(String str);
	
	@Query("SELECT p FROM Person p WHERE p.firstName LIKE %?1%")
	public List<Person> fetchNutritionistsByTerm(String term);

}
