package org.fourstack.populationcensus.service;

import java.util.List;

import org.fourstack.populationcensus.model.Person;

public interface CensusService {

	public List<Person> getAllPersons();
	public void addPerson(Person person);
	public void updatePerson(Person person);
	
	
}