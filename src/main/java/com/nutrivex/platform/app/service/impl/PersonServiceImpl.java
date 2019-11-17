package com.nutrivex.platform.app.service.impl;
import java.util.Collection;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nutrivex.platform.app.models.Person;
import com.nutrivex.platform.app.repository.PersonRepository;
import com.nutrivex.platform.app.service.PersonService;


@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;

	@Override
	@Transactional
	public int createPerson(Person person) {
		personRepository.save(person);
		return 0;
	}

	@Override
	public int updatePerson(Long id, Person person) {
		int result = 0;
		Optional<Person> originalPerson = personRepository.findById(id);
		if(originalPerson.isPresent()) {
			personRepository.save(person);
		}
		return result;
	}

	@Override
	public int deletePerson(Long id) {
		Optional<Person> Person = personRepository.findById(id);
		if (!Person.isPresent()) {return -1;}
		personRepository.delete(Person.get());
		return 0;
	}

	@Override
	public Collection<Person> getNutritionists() {
		return personRepository.listNutritionists();
	}

	@Override
	public Person findPerson(Long id) {
		return personRepository.findById(id).orElse(null);
	}

	@Override
	public Collection<Person> getNutritionists(String str) {
		return personRepository.searchNutritionistsByString(str);
	}


	
}
