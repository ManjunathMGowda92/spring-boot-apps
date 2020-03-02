package org.fourstack.populationcensus.model;

import java.io.Serializable;

public class Hobby implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8545778823531946016L;
	
	private int id;
	private String hobbyName;
	private String proficiency;

	public Hobby() {

	}

	public Hobby(int id, String hobbyName, String proficiency) {
		this.id = id;
		this.hobbyName = hobbyName;
		this.proficiency = proficiency;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHobbyName() {
		return hobbyName;
	}

	public void setHobbyName(String hobbyName) {
		this.hobbyName = hobbyName;
	}

	public String getProficiency() {
		return proficiency;
	}

	public void setProficiency(String proficiency) {
		this.proficiency = proficiency;
	}
}
