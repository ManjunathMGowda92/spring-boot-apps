package org.fourstack.populationcensus.controller;

import java.util.List;

import org.fourstack.populationcensus.model.Person;
import org.fourstack.populationcensus.service.CensusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<List<Person>> getAllPersons() {		
		return new ResponseEntity<List<Person>>(service.getAllPersons(), HttpStatus.OK);
	}
	
	@GetMapping("/persons/{id}")
	public ResponseEntity<Person> getPersonById(@PathVariable("id") long id) {
		return new ResponseEntity<Person>(service.getPersonById(id), HttpStatus.OK);
	}
		
	@PostMapping("/persons")
	public ResponseEntity<Person> savePerson(@RequestBody Person person) {
		return new ResponseEntity<Person>(service.addPerson(person), HttpStatus.CREATED);
	}
	
	@PutMapping("/persons/{id}")
	public ResponseEntity<Person> updatePerson(@RequestBody Person person, @PathVariable("id") long id) {
		return new ResponseEntity<Person>(service.updatePerson(person), HttpStatus.OK);
	}
}
