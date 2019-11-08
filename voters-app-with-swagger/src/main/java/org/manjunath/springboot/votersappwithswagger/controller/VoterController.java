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

/**
 * VoterController is a Spring Boot REST Controller annotation implemented class
 * which acts as api end point for the voters application.
 * <p>
 * 	Below are the api end url points.
 * <ul>
 * 	<li>/api/voters  - GET Method : Gets the list of Voters</li>
 * 	<li>/api/voters/{id}  - GET Method : Get a single voter by id</li>
 * 	<li>/api/voters/voter/{voterId} - GET Method : Get a single Voter by VoterId</li>
 * 	<li>/api/voters - POST Method : Add a voter into the application database</li>
 * 	<li>/api/voters/{id} - PUT Method : Update an existing Voter</li>
 * 	<li>/api/voters/{id} - DELETE Method : Delete a voter by id</li>
 * </ul>
 * </p>
 * 
 * @author Manjunath HM
 *
 */
@RestController
@RequestMapping("/api")
@Api(tags = { "Voter Application Controller" })
public class VoterController {

	@Autowired
	private VoterService service;

	@ApiOperation(value = "Get a list of available Voters", consumes = "application/json", produces = "application/json", response = List.class, httpMethod = "GET", notes = "REST Controller end point to fetch all the voters present in the database")
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

	@ApiOperation(value = "Get a Voter from the application database based on the id(primary key)", produces = "application/json", response = Voter.class, httpMethod = "GET", notes = "REST Controller end point to fetch the Voter based on the id(primary key)")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully retrieves the voter based on the id"),
			@ApiResponse(code = 401, message = "You are not authorized to access the resource"),
			@ApiResponse(code = 403, message = "Resource Access is forbidden"),
			@ApiResponse(code = 404, message = "Voter not found for the specified id")
	})
	@GetMapping("/voters/{id}")
	public Voter getVoterById(@PathVariable("id") int id) {
		return service.getVoterById(id);
	}

	@ApiOperation(value = "Get a Voter from the application database based on the voter id", produces = "application/json", response = Voter.class, httpMethod = "GET", notes = "REST Controller end point to fetch the Voter based on the voter id")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully retrieves the voter based on the id"),
			@ApiResponse(code = 401, message = "You are not authorized to access the resource"),
			@ApiResponse(code = 403, message = "Resource Access is forbidden"),
			@ApiResponse(code = 404, message = "Voter not found for the specified id")
	})
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
