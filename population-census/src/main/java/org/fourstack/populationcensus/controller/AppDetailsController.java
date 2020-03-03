package org.fourstack.populationcensus.controller;

import org.fourstack.populationcensus.model.CensusApplicationModel;
import org.fourstack.populationcensus.service.AppDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppDetailsController {

	@Autowired
	private AppDetailsService service;
	
	@GetMapping("/census/app_details")
	public CensusApplicationModel getApplicationDetails() {
		return service.getApplicationDetails();
	}
}
