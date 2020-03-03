package org.fourstack.populationcensus.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "person", uniqueConstraints = {@UniqueConstraint(columnNames = {"person_id"})})
public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7847409898191106723L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@JsonProperty("person_id")
	@Column(name = "person_id", nullable = false)
	private String personId;
	
	@JsonProperty("first_name")
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@JsonProperty("middle_name")
	@Column(name = "middle_name", nullable = true)
	private String middleName;
	
	@JsonProperty("last_name")
	@Column(name = "last_name", nullable = true)
	private String lastName;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@JsonFormat(pattern = "yyyy/MM/dd")
	@JsonProperty("birth_date")
	@Column(name = "date_of_birth", nullable = false)
	private LocalDate dateOfBirth;
	
	@JsonProperty("mail_id")
	@Column(name = "email_id", unique = true, nullable = false)
	private String mailId;
	
	@JsonProperty("contact_num_primary")
	@Column(name = "prim_contact_no", nullable = true)
	private String primaryContactNo;
	
	@JsonProperty("contact_num_secondary")
	@Column(name = "sec_contact_no", nullable = true)
	private String secondaryContactNo;
	
	@JsonProperty("gender")
	@Column(name = "gender", nullable = false)
	private String gender;
	
	@JsonProperty("is_literate")
	@Column(name = "is_literate", nullable = false, columnDefinition = "boolean default FALSE")
	private boolean isLiterate;
	
	@JsonProperty("marital_status")
	@Column(name = "is_married", nullable = false, columnDefinition = "boolean default FALSE")
	private boolean maritalStatus;
	
	@JsonProperty("father_name")
	@Column(name = "father_name", nullable = true, columnDefinition = "VARCHAR(255) default NULL")
	private String fatherName;
	
	@JsonProperty("husband_name")
	@Column(name = "husband_name", nullable = true, columnDefinition = "VARCHAR(255) default NULL")
	private String husbandName;	
	
	@JsonProperty("religion")
	@Column(name = "religion", nullable = true, columnDefinition = "VARCHAR(255) default NULL")
	private String religion;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "person_address_id")
	@JsonProperty("person_address")
	private Address address;
	
		
	@CreationTimestamp
	@Column(name = "created_date", nullable = false, updatable = false)
	private LocalDateTime createDateTime;
		
	@UpdateTimestamp
	@Column(name = "updated_date", nullable = false)
	private LocalDateTime updateDateTime;
	
	
	public Person() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getPrimaryContactNo() {
		return primaryContactNo;
	}

	public void setPrimaryContactNo(String primaryContactNo) {
		this.primaryContactNo = primaryContactNo;
	}

	public String getSecondaryContactNo() {
		return secondaryContactNo;
	}

	public void setSecondaryContactNo(String secondaryContactNo) {
		this.secondaryContactNo = secondaryContactNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isLiterate() {
		return isLiterate;
	}

	public void setLiterate(boolean isLiterate) {
		this.isLiterate = isLiterate;
	}

	public boolean isMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(boolean maritalStatus) {
		this.maritalStatus = maritalStatus;
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

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
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
