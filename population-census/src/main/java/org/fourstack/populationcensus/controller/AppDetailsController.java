package org.fourstack.populationcensus.controller;

import java.util.List;

import org.fourstack.populationcensus.model.CensusApplicationModel;
import org.fourstack.populationcensus.model.EndpointsDescription;
import org.fourstack.populationcensus.service.AppDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * <b><i>AppDetailsController</i></b> is a controller class, which provides the
 * details of Census Application
 * </p>
 * <p>
 * End points in the controller
 * <ol>
 * <li>/census/app_details : GET Method </li>
 * <li>/census/end_points : GET Method </li>
 * </ol>
 * </p>
 * 
 * @author Manjunath HM
 *
 */
@RestController
public class AppDetailsController {

	@Autowired
	private AppDetailsService service;

	@GetMapping("/census/app_details")
	public ResponseEntity<CensusApplicationModel> getApplicationDetails() {

		return new ResponseEntity<CensusApplicationModel>(service.getApplicationDetails(), HttpStatus.OK);

	}
	
	@GetMapping("/census/end_points")
	public ResponseEntity<List<EndpointsDescription>> endPointsDetails() {
		List<EndpointsDescription> endPoints = service.getEndPointsDetails();
		
		return new ResponseEntity<List<EndpointsDescription>>(endPoints, HttpStatus.OK);
	}
	
}
