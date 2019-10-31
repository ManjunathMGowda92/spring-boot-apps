package org.manjunath.springboot.votersappwithswagger.exceptionhandling;

public class VoterNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4592928734466586729L;

	/**
	 * #### Start of Constructors from the Super Class ####
	 */
	public VoterNotFoundException() {
		super();
	}

	public VoterNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public VoterNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public VoterNotFoundException(String message) {
		super(message);
	}

	public VoterNotFoundException(Throwable cause) {
		super(cause);
	}
	/**
	 * #### End of Constructors from the Super Class ####
	 */
}
