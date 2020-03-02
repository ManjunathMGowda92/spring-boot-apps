package org.fourstack.populationcensus.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7847409898191106723L;
	
	private long id;
	
	@JsonProperty("person_id")
	private String personId;
	
	@JsonProperty("first_name")
	private String firstName;
	
	@JsonProperty("middle_name")
	private String middleName;
	
	@JsonProperty("last_name")
	private String lastName;
	
	@JsonProperty("birth_date")
	private LocalDate dateOfBirth;
	
	@JsonProperty("mail_id")
	private String mailId;
	
	@JsonProperty("contact_num_primary")
	private String primaryContactNo;
	
	@JsonProperty("contact_num_secondary")
	private String secondaryContactNo;
	
	@JsonProperty("gender")
	private String gender;
	
	@JsonProperty("is_literate")
	private boolean isLiterate;
	
	@JsonProperty("marital_status")
	private boolean maritalStatus;
	
	@JsonProperty("father_name")
	private String fatherName;
	
	@JsonProperty("husband_name")
	private String husbandName;
	
	@JsonProperty("religion")
	private String religion;
	
	@JsonProperty("hobbies")
	private List<Hobby> hobbies;
	
	@JsonProperty("person_address")
	private Address address;
	
	@JsonProperty("occupational_details")
	private List<OccupationDetails> occupationDetails;
	
	@JsonProperty("education_details")
	private List<EducationDetails> educationDetails;
	
	@JsonProperty("health_details")
	private HealthDetails healthDetails;
	
	@JsonProperty("dependants_list")
	private List<DependantPersonDetail> dependantsList;
	
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

	public List<Hobby> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<Hobby> hobbies) {
		this.hobbies = hobbies;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<OccupationDetails> getOccupationDetails() {
		return occupationDetails;
	}

	public void setOccupationDetails(List<OccupationDetails> occupationDetails) {
		this.occupationDetails = occupationDetails;
	}

	public List<EducationDetails> getEducationDetails() {
		return educationDetails;
	}

	public void setEducationDetails(List<EducationDetails> educationDetails) {
		this.educationDetails = educationDetails;
	}

	public HealthDetails getHealthDetails() {
		return healthDetails;
	}

	public void setHealthDetails(HealthDetails healthDetails) {
		this.healthDetails = healthDetails;
	}

	public List<DependantPersonDetail> getDependantsList() {
		return dependantsList;
	}

	public void setDependantsList(List<DependantPersonDetail> dependantsList) {
		this.dependantsList = dependantsList;
	}
}
