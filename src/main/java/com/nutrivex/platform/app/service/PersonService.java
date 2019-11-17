package com.nutrivex.platform.app.service;


import java.util.Collection;

import com.nutrivex.platform.app.models.Person;

public interface PersonService {
	public abstract int createPerson(Person person);
	public abstract int updatePerson(Long id, Person person);
	public abstract int deletePerson(Long id);
	public abstract Person findPerson(Long id);
	public abstract Collection<Person> getNutritionists();
	public abstract Collection<Person> getNutritionists(String str);
}
