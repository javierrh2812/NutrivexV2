package com.nutrivex.platform.app.service;


import java.util.Collection;

import com.nutrivex.platform.app.models.Person;

public interface PersonService {
	public int createPerson(Person person);
	public int updatePerson(Long id, Person person);
	public int deletePerson(Long id);
	public Person findPerson(Long id);
	public Collection<Person> getNutritionists();
	public Collection<Person> getBúsquedaNutritionists(String str);
}
