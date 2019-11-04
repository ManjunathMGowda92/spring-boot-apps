package org.manjunath.springboot.votersappwithswagger.controller;

import java.util.List;

import org.manjunath.springboot.votersappwithswagger.model.Voter;
import org.manjunath.springboot.votersappwithswagger.service.VoterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VoterController {
	
	@Autowired
	private VoterService service;
	
	@GetMapping("/voters")
	public List<Voter> getAllVoters() {
		return service.getAllVoters();
	}
	
	@GetMapping("/voters/{id}")
	public Voter getVoterById(@PathVariable("id") int id) {
		return service.getVoterById(id);
	}
	
	@GetMapping("/voters/voter/{voterId}")
	public Voter getVoterByVoterId(@PathVariable("voterId") String voterId) {
		return null;
	}
	
	@PostMapping("/voters")
	public Voter addVoter(@RequestBody Voter voter) {
		voter.setId(0);
		return service.addVoter(voter);
	}
	
	@PutMapping("/voters/{id}")
	public Voter updateVoter(@RequestBody Voter voter, @PathVariable("id") int id) {
		return service.updateVoter(voter);
	}
	
	@DeleteMapping("/voters/{id}")
	public Voter deleteVoterById(@PathVariable("id") int id){
		return service.deleteVoterById(id);
	}
}
