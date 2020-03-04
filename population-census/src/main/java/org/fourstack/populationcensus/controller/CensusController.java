package org.fourstack.populationcensus.controller;

import java.util.List;

import org.fourstack.populationcensus.model.Person;
import org.fourstack.populationcensus.service.CensusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/census/api")
public class CensusController {

	@Autowired
	private CensusService service;

	@GetMapping("/persons")
	public List<Person> getAllPersons() {
		return service.getAllPersons();
	}
	
	@GetMapping("/persons/{id}")
	public Person getPersonById(@PathVariable("id") long id) {
		return service.getPersonById(id);
	}
		
	@PostMapping("/persons")
	public void savePerson(@RequestBody Person person) {
		service.addPerson(person);
	}
	
	@PutMapping("/persons/{id}")
	public void updatePerson(@RequestBody Person person, @PathVariable("id") long id) {
		service.updatePerson(person);
	}
}
