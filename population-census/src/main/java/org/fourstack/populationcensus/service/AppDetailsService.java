package org.fourstack.populationcensus.service;

import org.fourstack.populationcensus.model.CensusApplicationModel;
import org.springframework.stereotype.Service;

@Service
public class AppDetailsService {
	
	public CensusApplicationModel getApplicationDetails() {
		CensusApplicationModel appModel = new CensusApplicationModel();
		appModel.setApplicationName("Population-Census");
		appModel.setApplicationVersion("1.0.0");
		appModel.setApplicationDescription("Application to show the census data");
		
		return appModel;
	}
}
