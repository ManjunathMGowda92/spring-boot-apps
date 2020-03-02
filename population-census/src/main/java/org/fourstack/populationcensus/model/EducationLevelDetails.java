package org.fourstack.populationcensus.model;

import java.io.Serializable;
import java.time.LocalDate;

public class EducationLevelDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1679777833999739416L;
	
	private String instituteName;
	private String highestEducationInInstitute;
	private LocalDate startYear;
	private LocalDate endYear;
	private boolean courseCompletionStatus;
	
	public EducationLevelDetails() {
	}
	
	public EducationLevelDetails(String instituteName, String highestEducationInInstitute, LocalDate startYear,
			LocalDate endYear, boolean courseCompletionStatus) {
		this.instituteName = instituteName;
		this.highestEducationInInstitute = highestEducationInInstitute;
		this.startYear = startYear;
		this.endYear = endYear;
		this.courseCompletionStatus = courseCompletionStatus;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public String getHighestEducationInInstitute() {
		return highestEducationInInstitute;
	}

	public void setHighestEducationInInstitute(String highestEducationInInstitute) {
		this.highestEducationInInstitute = highestEducationInInstitute;
	}

	public LocalDate getStartYear() {
		return startYear;
	}

	public void setStartYear(LocalDate startYear) {
		this.startYear = startYear;
	}

	public LocalDate getEndYear() {
		return endYear;
	}

	public void setEndYear(LocalDate endYear) {
		this.endYear = endYear;
	}

	public boolean isCourseCompletionStatus() {
		return courseCompletionStatus;
	}

	public void setCourseCompletionStatus(boolean courseCompletionStatus) {
		this.courseCompletionStatus = courseCompletionStatus;
	}
}
