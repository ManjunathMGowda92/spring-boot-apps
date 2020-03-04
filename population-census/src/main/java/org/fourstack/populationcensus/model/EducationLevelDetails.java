package org.fourstack.populationcensus.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "education_level_details")
public class EducationLevelDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1679777833999739416L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "institute_name")
	@JsonProperty("name_of_institute")
	private String instituteName;
	
	@Column(name = "highest_education_in_institute")
	@JsonProperty("highest_education_in_institute")
	private String highestEducationInInstitute;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@JsonFormat(pattern = "yyyy/MM/dd")
	@Column(name = "start_year")
	@JsonProperty("start_year")
	private LocalDate startYear;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@JsonFormat(pattern = "yyyy/MM/dd")
	@Column(name = "end_year")
	@JsonProperty("end_year")
	private LocalDate endYear;
	
	@Column(name = "course_completion_status")
	@JsonProperty("is_course_completed")
	private boolean courseCompletionStatus;
	
	public EducationLevelDetails() {
	}
		
	public EducationLevelDetails(long id, String instituteName, String highestEducationInInstitute, LocalDate startYear,
			LocalDate endYear, boolean courseCompletionStatus) {
		this.id = id;
		this.instituteName = instituteName;
		this.highestEducationInInstitute = highestEducationInInstitute;
		this.startYear = startYear;
		this.endYear = endYear;
		this.courseCompletionStatus = courseCompletionStatus;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
