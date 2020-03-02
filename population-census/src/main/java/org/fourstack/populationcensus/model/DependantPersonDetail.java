package org.fourstack.populationcensus.model;

import java.io.Serializable;

public class DependantPersonDetail implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2592392156762262886L;
	
	private long dependantId;
	//private long personId;
	
	private String relationshipWithDependant;
	
	public DependantPersonDetail() {
	}

	public DependantPersonDetail(long dependantId, String relationshipWithDependant) {
		this.dependantId = dependantId;
		this.relationshipWithDependant = relationshipWithDependant;
	}

	public long getDependantId() {
		return dependantId;
	}

	public void setDependantId(long dependantId) {
		this.dependantId = dependantId;
	}

	public String getRelationshipWithDependant() {
		return relationshipWithDependant;
	}

	public void setRelationshipWithDependant(String relationshipWithDependant) {
		this.relationshipWithDependant = relationshipWithDependant;
	}
}
