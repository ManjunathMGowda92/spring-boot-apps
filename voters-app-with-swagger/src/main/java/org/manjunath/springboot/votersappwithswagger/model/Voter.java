package org.manjunath.springboot.votersappwithswagger.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Voter implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3184932883727729011L;
	
	@Id
	private int id;
	private String voterId;
	private String firstName;
	private String lastName;
	private String fatherName;
	private String husbandName;
	private String dob;
	private VoterAddress address;
	
	public Voter() {}

	public Voter(int id, String voterId, String firstName, String lastName, String fatherName, String husbandName,
			String dob, VoterAddress address) {
		this.id = id;
		this.voterId = voterId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fatherName = fatherName;
		this.husbandName = husbandName;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public VoterAddress getAddress() {
		return address;
	}

	public void setAddress(VoterAddress address) {
		this.address = address;
	}
}
