package org.fourstack.controllers;

import org.fourstack.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@Autowired
	private SampleService service;
	
	@GetMapping("/test")
	public String getString() {
		return service.getServiceName();
	}
}
