package org.manjunath.basicvoterapi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2228645571258973680L;
	
	@Column(name = "DOOR_NO")
	private String doorNo;
	
	@Column(name = "STREET")
	private String street;
	
	@Column(name = "LOCALITY")
	private String locality;
	
	@Column(name = "POST")
	private String post;
	
	@Column(name = "TALUK")
	private String taluk;
	
	@Column(name = "DISTRICT")
	private String district;
	
	@Column(name = "STATE")
	private String state;
	
	@Column(name = "COUNTRY")
	private String country;
	
	@Column(name = "ZIP_CODE")
	private String zipCode;
	
	public Address() {}

	public Address(String doorNo, String street, String locality, String post, String taluk, String district,
			String state, String country, String zipCode) {
		this.doorNo = doorNo;
		this.street = street;
		this.locality = locality;
		this.post = post;
		this.taluk = taluk;
		this.district = district;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
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

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}
