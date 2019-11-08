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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api")
@Api(tags = { "Voter Application Controller" })
public class VoterController {

	@Autowired
	private VoterService service;

	@ApiOperation(value = "View a list of available Voters", 
			consumes = "application/json", 
			produces = "application/json", 
			response = List.class, 
			httpMethod = "GET", 
			notes = "Rest Controller end point to fetch all the voters present in the database")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	})
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
	public Voter deleteVoterById(@PathVariable("id") int id) {
		return service.deleteVoterById(id);
	}
}
