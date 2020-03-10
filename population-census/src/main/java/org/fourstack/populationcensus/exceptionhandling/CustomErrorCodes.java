package org.fourstack.populationcensus.exceptionhandling;

public enum CustomErrorCodes {

	PERSON_NOT_FOUND("CENSUS_401", "Requested Person Details Not Found"),
	PERSONS_LIST_NOT_FOUND("CENSUS_402", "Person List is Empty"),
	CONSTRAINT_VALIDATION_ERROR("CENSUS_400", "Missing Required Constraint Column"),
	CENSUS_GENERIC_ERROR("CENSUS_500","Internal Error. Something went Wrong");

	private final String custErrorCode;
	private final String custErrorMsg;

	CustomErrorCodes(String custErrorCode, String custErrorMsg) {
		this.custErrorCode = custErrorCode;
		this.custErrorMsg = custErrorMsg;
	}

	public String code() {
		return this.custErrorCode;
	}

	public String value() {
		return this.custErrorMsg;
	}

	@Override
	public String toString() {
		return this.custErrorMsg +" "+name();
	}
}
