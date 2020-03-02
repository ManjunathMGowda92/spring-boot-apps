package org.fourstack.populationcensus.model;

import java.io.Serializable;
import java.util.List;

public class HealthDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7730405929993595397L;
	
	private long id;
	private boolean isHealthInsuranceAvailable;
	private boolean isSufferingFromDisease;
	private List<String> sufferingDiseaseList;
	
	public HealthDetails() {
	}

	public HealthDetails(long id, boolean isHealthInsuranceAvailable, boolean isSufferingFromDisease,
			List<String> sufferingDiseaseList) {
		this.id = id;
		this.isHealthInsuranceAvailable = isHealthInsuranceAvailable;
		this.isSufferingFromDisease = isSufferingFromDisease;
		this.sufferingDiseaseList = sufferingDiseaseList;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isHealthInsuranceAvailable() {
		return isHealthInsuranceAvailable;
	}

	public void setHealthInsuranceAvailable(boolean isHealthInsuranceAvailable) {
		this.isHealthInsuranceAvailable = isHealthInsuranceAvailable;
	}

	public boolean isSufferingFromDisease() {
		return isSufferingFromDisease;
	}

	public void setSufferingFromDisease(boolean isSufferingFromDisease) {
		this.isSufferingFromDisease = isSufferingFromDisease;
	}

	public List<String> getSufferingDiseaseList() {
		return sufferingDiseaseList;
	}

	public void setSufferingDiseaseList(List<String> sufferingDiseaseList) {
		this.sufferingDiseaseList = sufferingDiseaseList;
	}
}
