package org.fourstack.populationcensus.service;

import java.util.List;

import org.fourstack.populationcensus.model.Person;
import org.fourstack.populationcensus.repository.CensusDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CensusServiceImpl implements CensusService {

	@Autowired
	private CensusDAO dao;
	
	
	@Override
	public List<Person> getAllPersons() {
		return dao.findAll();
	}

	@Override
	public Person addPerson(Person person) {
		person.setId(0);
		return dao.save(person);
	}

	@Override
	public Person updatePerson(Person person) {
		return dao.save(person);
	}

	@Override
	public Person getPersonById(long id) {
		return dao.findById(id).get();
	}
	
	

}
