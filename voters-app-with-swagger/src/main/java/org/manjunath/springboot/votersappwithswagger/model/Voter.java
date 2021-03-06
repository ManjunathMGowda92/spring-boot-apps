package org.manjunath.springboot.votersappwithswagger.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name ="VOTERS", uniqueConstraints = {@UniqueConstraint(columnNames = {"VOTERID"})})
public class Voter implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3184932883727729011L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "VOTERID")
	private String voterId;
	
	@Column(name = "FIRSTNAME")
	private String firstName;
	
	@Column(name = "LASTNAME")
	private String lastName;
	
	@Column(name = "FATHERNAME")
	private String fatherName;
	
	@Column(name = "HUSBANDNAME")
	private String husbandName;
	
	@Column(name = "GENDER")
	private String gender;
	
	@Column(name = "DATE_OF_BIRTH")
	private String dob;
	
	private VoterAddress address;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_DATE", updatable = false)
	private Date createTimeStamp;
	
	@UpdateTimestamp
	@Column(name = "UPDATED_DATE")
	private Date updateTimeStamp;
	
	public Voter() {}

	public Voter(int id, String voterId, String firstName, String lastName, String fatherName, String husbandName,
			String dob, String gender, VoterAddress address) {
		this.id = id;
		this.voterId = voterId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fatherName = fatherName;
		this.husbandName = husbandName;
		this.dob = dob;
		this.address = address;
		this.gender = gender;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
