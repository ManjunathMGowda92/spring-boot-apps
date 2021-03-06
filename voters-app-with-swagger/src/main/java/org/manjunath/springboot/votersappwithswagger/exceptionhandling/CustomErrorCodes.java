package org.manjunath.springboot.votersappwithswagger.exceptionhandling;

public interface CustomErrorCodes {
	
	public static final String VOTER_NOT_FOUND_CODE = "VOTER_001";
	public static final String VOTER_NOT_FOUND_MSG = "Specified Voter Not Found";
	
	public static final String VOTER_CONSTARINT_EXCEPTION_CODE = "VOTER_002";
	public static final String VOTER_CONSTARINT_EXCEPTION_MSG = "Unique Constraint Voilation Exception Occurred.";
	
	public static final String VOTER_GENERIC_EXCEPTION_CODE = "VOTER_010";
	public static final String VOTER_GENERIC_EXCEPTION_MSG = "An Exception Occurred. Please Contact Administrator.";
	
	public static final String VOTER_NULL_EXCEPTION_CODE = "VOTER_011";
	public static final String VOTER_NULL_EXCEPTION_MSG = "NullPointerException Occurred.";
}
