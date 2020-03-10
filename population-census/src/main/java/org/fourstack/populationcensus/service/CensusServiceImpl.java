package org.fourstack.populationcensus.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.fourstack.populationcensus.exceptionhandling.PersonNotFoundException;
import org.fourstack.populationcensus.exceptionhandling.PersonResultListNotFoundException;
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
		List<Person> personList = dao.findAll();
		if (personList == null || personList.size() == 0)
			throw new PersonResultListNotFoundException("Requested List Not Found");
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
		Person person = null;
		try {
			person = dao.findById(id).get();
		} catch (NoSuchElementException e) {
			throw new PersonNotFoundException("Requested Person not found with id:"+id);
		}
		if (person == null)
			throw new PersonNotFoundException("Requested Person not found with id:"+id);
		return dao.findById(id).get();
	}
	
	

}
