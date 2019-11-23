package com.nutrivex.platform.app.service;


import java.util.Collection;
import java.util.List;

import com.nutrivex.platform.app.models.Person;

public interface PersonService {
	public List<Person>fetchNutritionistsByTerm (String term) throws Exception;

	public abstract int createPerson(Person person);
	public abstract int updatePerson(Long id, Person person);
	public abstract int deletePerson(Long id);
	public abstract Person findPerson(Long id);
	public abstract Collection<Person> getNutritionists();
	public abstract Collection<Person> getBúsquedaNutritionists(String str);
	
	

}
