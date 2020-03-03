package org.fourstack.populationcensus.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CensusApplicationModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1533015418546135279L;
	
	@JsonProperty(value = "application_name")
	private String applicationName;
	
	@JsonProperty(value = "application_version")
	private String applicationVersion;
	
	@JsonProperty(value = "application_description")
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
