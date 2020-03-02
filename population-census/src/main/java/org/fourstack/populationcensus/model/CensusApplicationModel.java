package org.fourstack.populationcensus.model;

import java.io.Serializable;

public class CensusApplicationModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1533015418546135279L;
	
	private String applicationName;
	private String applicationVersion;
	private String applicationDescription;
	
	public CensusApplicationModel() {}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getApplicationVersion() {
		return applicationVersion;
	}

	public void setApplicationVersion(String applicationVersion) {
		this.applicationVersion = applicationVersion;
	}

	public String getApplicationDescription() {
		return applicationDescription;
	}

	public void setApplicationDescription(String applicationDescription) {
		this.applicationDescription = applicationDescription;
	}	
}
