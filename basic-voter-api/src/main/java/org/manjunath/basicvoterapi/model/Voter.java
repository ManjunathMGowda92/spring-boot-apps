package org.manjunath.basicvoterapi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "VOTERS", uniqueConstraints = {@UniqueConstraint(columnNames = "VOTER_ID")})
public class Voter implements Serializable{
	private static final long serialVersionUID = -4141620722337521072L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "VOTER_ID")
	private String voterId;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "FATHER_NAME")
	private String fatherName;
	
	@Column(name = "HUSBAND_NAME")
	private String husbandName;
	
	@Column(name = "GENDER")
	private String gender;
	
	@Column(name = "DATE_OF_BIRTH")
	private String dob;
	
	private Address address;
	
	public Voter() {}

	public Voter(int id, String voterId, String firstName, String lastName, String fatherName, String husbandName,
			String gender, String dob, Address address) {
		this.id = id;
		this.voterId = voterId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fatherName = fatherName;
		this.husbandName = husbandName;
		this.gender = gender;
		this.dob = dob;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVoterId() {
		return voterId;
	}

	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getHusbandName() {
		return husbandName;
	}

	public void setHusbandName(String husbandName) {
		this.husbandName = husbandName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
