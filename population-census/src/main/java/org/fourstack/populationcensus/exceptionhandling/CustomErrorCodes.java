package org.fourstack.populationcensus.exceptionhandling;

public enum CustomErrorCodes {

	PERSON_NOT_FOUND("CENSUS_101", "Requested Person Details Not Found");

	private final String custErrorCode;
	private final String custErrorMsg;

	CustomErrorCodes(String custErrorCode, String custErrorMsg) {
		this.custErrorCode = custErrorCode;
		this.custErrorMsg = custErrorMsg;
	}

	public String custErrorCode() {
		return this.custErrorCode;
	}

	public String custErrorMsg() {
		return this.custErrorMsg;
	}

	@Override
	public String toString() {
		return this.custErrorMsg +" "+name();
	}
}
