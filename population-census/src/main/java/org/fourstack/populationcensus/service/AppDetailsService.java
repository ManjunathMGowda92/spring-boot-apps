package org.fourstack.populationcensus.service;

import java.util.ArrayList;
import java.util.List;

import org.fourstack.populationcensus.model.CensusApplicationModel;
import org.fourstack.populationcensus.model.EndpointsDescription;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AppDetailsService {
	
	@Value("${app.name}")
	private String applicationName;
	
	@Value("${app.version}")
	private String applicationVersion;
	
	@Value("${app.description}")
	private String applicationDescription;
	
	public CensusApplicationModel getApplicationDetails() {
		CensusApplicationModel appModel = new CensusApplicationModel();
		appModel.setApplicationName(applicationName);
		appModel.setApplicationVersion(applicationVersion);
		appModel.setApplicationDescription(applicationDescription);
		
		return appModel;
	}
	
	public List<EndpointsDescription> getEndPointsDetails() {
		List<EndpointsDescription> endPoints = new ArrayList<>();

		endPoints.add(new EndpointsDescription("@GET", "/census/api/persons", "To fetch list of all Persons"));
		endPoints.add(new EndpointsDescription("@GET", "/census/api/persons/{id}", "To fetch particular Person based on the id"));
		endPoints.add(new EndpointsDescription("@POST", "/census/api/persons", "To save a new Person to the database"));
		endPoints.add(new EndpointsDescription("@PUT", "/census/api/persons/{id}", "To update an existing Person based on the id"));
		
		return endPoints;
	}
}
