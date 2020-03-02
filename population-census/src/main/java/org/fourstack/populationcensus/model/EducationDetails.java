package org.fourstack.populationcensus.model;

import java.io.Serializable;
import java.util.List;

public class EducationDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7283675211201911008L;
	
	private long id;
	private String educationLevel;
	private String educationStatus;
	private String highestEducation;
	private List<EducationLevelDetails> educationLevelDetails;
	
	
	public EducationDetails() {
	}

	public EducationDetails(long id, String educationLevel, String educationStatus, String highestEducation,
			List<EducationLevelDetails> educationLevelDetails) {
		this.id = id;
		this.educationLevel = educationLevel;
		this.educationStatus = educationStatus;
		this.highestEducation = highestEducation;
		this.educationLevelDetails = educationLevelDetails;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	public String getEducationStatus() {
		return educationStatus;
	}

	public void setEducationStatus(String educationStatus) {
		this.educationStatus = educationStatus;
	}

	public String getHighestEducation() {
		return highestEducation;
	}

	public void setHighestEducation(String highestEducation) {
		this.highestEducation = highestEducation;
	}

	public List<EducationLevelDetails> getEducationLevelDetails() {
		return educationLevelDetails;
	}

	public void setEducationLevelDetails(List<EducationLevelDetails> educationLevelDetails) {
		this.educationLevelDetails = educationLevelDetails;
	}
}
