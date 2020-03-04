package org.fourstack.populationcensus.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "education_details")
public class EducationDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7283675211201911008L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "education_level")
	@JsonProperty("level_of_education")
	private String educationLevel;
	
	@Column(name = "education_status")
	@JsonProperty("status_of_eduaction")
	private String educationStatus;
	
	@Column(name = "highest_education")
	@JsonProperty("highest_education")
	private String highestEducation;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "education_detail_id")
	@JsonProperty("education_level_details")
	private List<EducationLevelDetails> educationLevelDetails;
	
	/*
	 * Below column is for Bi-Directional mapping of Hibernate. This column maps
	 * back to the person and informs the hibernate saying mapping will be taken
	 * care by the "educationDetails" field in the Person column. So it avoids multiple table
	 * creation for mapping the PERSON and EDUCATION_DETAILS tables
	 */
	@OneToOne(mappedBy = "educationDetails", cascade = CascadeType.ALL)
	private Person person;
	
	@CreationTimestamp
	@Column(name = "created_date", nullable = false, updatable = false)
	private LocalDateTime createdDateTime;
	
	@CreationTimestamp
	@Column(name = "updated_date", nullable = false, updatable = true)
	private LocalDateTime updatedDateTime;
	
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
