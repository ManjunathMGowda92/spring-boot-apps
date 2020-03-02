package org.fourstack.populationcensus.controller;

import java.util.ArrayList;
import java.util.List;

import org.fourstack.populationcensus.model.CensusApplicationModel;
import org.fourstack.populationcensus.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/census/api")
public class CensusController {
	
	@GetMapping("/app_details")
	public CensusApplicationModel getApplicationDetails() {
		CensusApplicationModel appModel = new CensusApplicationModel();
		appModel.setApplicationName("Population-Census");
		appModel.setApplicationVersion("1.0.0");
		appModel.setApplicationDescription("Application to show the census data");
		
		
		return appModel;
	}
	
	@GetMapping("/persons")
	public List<Person> getAllPersons() {
		List<Person> pList = new ArrayList<Person>();
		pList.add(new Person());
		return pList;
	}
}
