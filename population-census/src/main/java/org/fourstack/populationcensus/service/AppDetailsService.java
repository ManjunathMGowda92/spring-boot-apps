package org.fourstack.populationcensus.service;

import org.fourstack.populationcensus.model.CensusApplicationModel;
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
}
