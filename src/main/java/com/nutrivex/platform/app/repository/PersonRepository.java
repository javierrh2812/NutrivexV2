package com.nutrivex.platform.app.repository;


import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nutrivex.platform.app.models.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
	
	@Query("select p from Person p where p.user.role.id=1")
	public Collection<Person> listNutritionists();
	
	@Query("select p from Person p where p.firstName LIKE '%?1%'")
	public Collection<Person> searchNutritionistsByString(String str);

}
