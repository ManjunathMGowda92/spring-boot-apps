package org.fourstack.populationcensus.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "suffering_disease_details")
public class SufferingDisease implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8835237162572181401L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "disease_name")
	@JsonProperty("disease_name")
	private String diseaseName;
	
	public SufferingDisease() {
	}

	public SufferingDisease(long id, String diseaseName) {
		this.id = id;
		this.diseaseName = diseaseName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDiseaseName() {
		return diseaseName;
	}

	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}
}
