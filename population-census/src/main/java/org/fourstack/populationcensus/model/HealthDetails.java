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
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "health_details")
public class HealthDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7730405929993595397L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "is_insurance_exists")
	@JsonProperty("is_health_insurance_available")
	private boolean isHealthInsuranceAvailable;
	
	@Column(name = "is_suffering_from_disease")
	@JsonProperty("is_suffering_from_any_disease")
	private boolean isSufferingFromDisease;
	
	/*
	 * @Column(name = "suffering_diseases_list") 
	 * @ElementCollection(targetClass = String.class) 
	 * @JsonProperty("suffering_diseases_list") private List<String>
	 * sufferingDiseaseList;
	 */
	
	
	/*
	 * @JoinColumn(name = "health_details_id") indicates the Column name in suffering_disease table. If
	 * we are not using the @joinColumn, then a separate table will be created to
	 * map both SUFFERING_DISEASE and HEALTH_DETAILS
	 */
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "health_details_id")
	@JsonProperty("suffering_diseases_list")
	private List<SufferingDisease> sufferingDiseaseList;
	
	@CreationTimestamp
	@Column(name = "created_date", nullable = false, updatable = false)
	private LocalDateTime createdDateTime;

	@UpdateTimestamp
	@Column(name = "updated_date", nullable = false, updatable = true)
	private LocalDateTime updatedDateTime;
	
	@OneToOne(mappedBy = "healthDetails", cascade = CascadeType.ALL)
	private Person person;
	
	public HealthDetails() {
	}

	public HealthDetails(long id, boolean isHealthInsuranceAvailable, boolean isSufferingFromDisease,
			List<SufferingDisease> sufferingDiseaseList, LocalDateTime createdDateTime, LocalDateTime updatedDateTime,
			Person person) {
		this.id = id;
		this.isHealthInsuranceAvailable = isHealthInsuranceAvailable;
		this.isSufferingFromDisease = isSufferingFromDisease;
		this.sufferingDiseaseList = sufferingDiseaseList;
		this.createdDateTime = createdDateTime;
		this.updatedDateTime = updatedDateTime;
		this.person = person;
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

	public List<SufferingDisease> getSufferingDiseaseList() {
		return sufferingDiseaseList;
	}

	public void setSufferingDiseaseList(List<SufferingDisease> sufferingDiseaseList) {
		this.sufferingDiseaseList = sufferingDiseaseList;
	}
}
