package com.nutrivex.platform.app.service;
import java.util.Collection;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nutrivex.platform.app.models.Person;
import com.nutrivex.platform.app.repository.PersonRepository;


@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;

	@Override
	@Transactional
	public int createPerson(Person person) {
		// TODO Auto-generated method stub
		personRepository.save(person);
		return 0;
	}

	@Override
	public int updatePerson(Long id, Person person) {
		// TODO Auto-generated method stub
		int result = 0;
		Optional<Person> originalPerson = personRepository.findById(id);
		if(originalPerson.isPresent()) {
			personRepository.save(person);
		}
		return result;
	}

	@Override
	public int deletePerson(Long id) {
		// TODO Auto-generated method stub
		Optional<Person> Person = personRepository.findById(id);
		if (!Person.isPresent()) {return -1;}
		personRepository.delete(Person.get());
		return 0;
	}

	@Override
	public Collection<Person> getNutritionists() {
		// TODO Auto-generated method stub
		return personRepository.listarNutricionistas();
	}

	@Override
	public Person findPerson(Long id) {
		return personRepository.findById(id).orElse(null);
	}

	@Override
	public Collection<Person> getBúsquedaNutritionists(String str) {
		return personRepository.listarNutricionistasBusquedaPorNombre(str);
	}

	
}
