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

/**
 * Model <b><i>Address</i></b> used to create a Hibernate Entity and maps to the
 * table with name "address". <br/>
 * This class is used to handle the address of each <b>Person</b> Entity and it
 * is bi-Directional mapping.
 * <p>
 * Property "person" is used for bi-directional mapping.
 * </p>
 * 
 * @author Manjunath_HM
 *
 */
@Entity
@Table(name = "address")
public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9168001106037199577L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "door_no")
	@JsonProperty("door_no")
	private String doorNo;

	@Column(name = "street")
	@JsonProperty("street")
	private String street;

	@Column(name = "locality")
	@JsonProperty("locality")
	private String locality;

	@Column(name = "post")
	@JsonProperty("post")
	private String post;

	@Column(name = "taluk")
	@JsonProperty("taluk")
	private String taluk;

	@Column(name = "district")
	@JsonProperty("district")
	private String district;

	@Column(name = "state")
	@JsonProperty("state")
	private String state;

	@Column(name = "country")
	@JsonProperty("country")
	private String country;

	@Column(name = "pincode")
	@JsonProperty("pincode")
	private String pincode;

	@CreationTimestamp
	@Column(name = "created_date", nullable = false, updatable = false)
	private LocalDateTime createDateTime;

	@UpdateTimestamp
	@Column(name = "updated_date", nullable = false)
	private LocalDateTime updateDateTime;

	/*
	 * Below column is for Bi-Directional mapping of Hibernate. This column maps
	 * back to the person and informs the hibernate saying mapping will be taken
	 * care by the "address" field in the Person column. So it avoids multiple table
	 * creation for mapping the PERSON and ADDRESS tables
	 */
	@OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
	private Person person;

	public Address() {
	}

	public Address(long id, String doorNo, String street, String locality, String post, String taluk, String district,
			String state, String country, String pincode) {
		this.id = id;
		this.doorNo = doorNo;
		this.street = street;
		this.locality = locality;
		this.post = post;
		this.taluk = taluk;
		this.district = district;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getTaluk() {
		return taluk;
	}

	public void setTaluk(String taluk) {
		this.taluk = taluk;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public LocalDateTime getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(LocalDateTime createDateTime) {
		this.createDateTime = createDateTime;
	}

	public LocalDateTime getUpdateDateTime() {
		return updateDateTime;
	}

	public void setUpdateDateTime(LocalDateTime updateDateTime) {
		this.updateDateTime = updateDateTime;
	}
}
