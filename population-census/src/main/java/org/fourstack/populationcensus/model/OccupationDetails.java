package org.fourstack.populationcensus.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "occupation_details")
public class OccupationDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2412469453240330820L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "occupation_name")
	@JsonProperty("occupation_name")
	private String occupationName;
	
	@Column(name = "is_full_time")
	@JsonProperty("is_occupation_fulltime")
	private boolean isOccupationFullTime;
	
	@Column(name ="exp_in_years")
	@JsonProperty("exp_in_years")
	private String experinceInYears;
	
	@CreationTimestamp
	@Column(name = "created_date", nullable = false, updatable = false)
	private LocalDateTime createdDateTime;
	
	@UpdateTimestamp
	@Column(name = "updated_date", nullable = false, updatable = true)
	private LocalDateTime updatedDateTime;
	
	@OneToOne(mappedBy = "occupation", cascade = CascadeType.ALL)
	private Person person;
	
	public OccupationDetails() {
	}
	
	public OccupationDetails(long id, String occupationName, boolean isOccupationFullTime, String experinceInYears) {
		this.id = id;
		this.occupationName = occupationName;
		this.isOccupationFullTime = isOccupationFullTime;
		this.experinceInYears = experinceInYears;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOccupationName() {
		return occupationName;
	}

	public void setOccupationName(String occupationName) {
		this.occupationName = occupationName;
	}

	public boolean isOccupationFullTime() {
		return isOccupationFullTime;
	}

	public void setOccupationFullTime(boolean isOccupationFullTime) {
		this.isOccupationFullTime = isOccupationFullTime;
	}

	public String getExperinceInYears() {
		return experinceInYears;
	}

	public void setExperinceInYears(String experinceInYears) {
		this.experinceInYears = experinceInYears;
	}
}
