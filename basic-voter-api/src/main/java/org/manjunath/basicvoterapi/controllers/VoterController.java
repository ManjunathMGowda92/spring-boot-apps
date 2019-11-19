package org.manjunath.basicvoterapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class VoterController {
	
	@GetMapping
	public String getResult(){
		return "Hello Voter";
	}

}