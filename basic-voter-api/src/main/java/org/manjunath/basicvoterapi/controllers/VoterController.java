package org.manjunath.basicvoterapi.controllers;

import java.util.List;

import org.manjunath.basicvoterapi.model.Voter;
import org.manjunath.basicvoterapi.services.VoterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class VoterController {
	
	@Autowired
	VoterService service;
	
	@GetMapping("/voters")
	public List<Voter> getVotersList(){
		return service.getVotersList();
	}

}
