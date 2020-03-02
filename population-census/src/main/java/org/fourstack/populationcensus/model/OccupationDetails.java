package org.fourstack.populationcensus.model;

import java.io.Serializable;

public class OccupationDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2412469453240330820L;
	
	private long id;
	private String occupationName;
	private boolean isOccupationFullTime;
	private String experinceInYears;
	
	public OccupationDetails() {
	}
	
	public OccupationDetails(long id, String occupationName, boolean isOccupationFullTime, String experinceInYears) {
		this.id = id;
		this.occupationName = occupationName;
		this.isOccupationFullTime = isOccupationFullTime;
		this.experinceInYears = experinceInYears;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOccupationName() {
		return occupationName;
	}

	public void setOccupationName(String occupationName) {
		this.occupationName = occupationName;
	}

	public boolean isOccupationFullTime() {
		return isOccupationFullTime;
	}

	public void setOccupationFullTime(boolean isOccupationFullTime) {
		this.isOccupationFullTime = isOccupationFullTime;
	}

	public String getExperinceInYears() {
		return experinceInYears;
	}

	public void setExperinceInYears(String experinceInYears) {
		this.experinceInYears = experinceInYears;
	}
}
