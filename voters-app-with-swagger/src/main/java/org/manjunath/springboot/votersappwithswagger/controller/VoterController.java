package org.manjunath.springboot.votersappwithswagger.controller;

import java.util.List;

import org.manjunath.springboot.votersappwithswagger.exceptionhandling.VoterNotFoundException;
import org.manjunath.springboot.votersappwithswagger.model.Voter;
import org.manjunath.springboot.votersappwithswagger.service.VoterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VoterController {
	
	@Autowired
	private VoterService service;
	
	@GetMapping("/voters")
	public List<Voter> getAllVoters() {
		throw new VoterNotFoundException("Voters Not Found");
	}
	
	@GetMapping("/voters/{id}")
	public Voter getVoterById(@PathVariable int id) {
		return null;
	}
	
	@GetMapping("/voters/{voterId}")
	public Voter getVoterByVoterId(@PathVariable String voterId) {
		return null;
	}
}
