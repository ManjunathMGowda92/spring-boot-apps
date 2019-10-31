package org.manjunath.springboot.votersappwithswagger.exceptionhandling;

public class VoterGenericException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 589096503794128308L;

	/**
	 * #### Start of Constructors from the Super Class ####
	 */
	public VoterGenericException() {
		super();
	}

	public VoterGenericException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public VoterGenericException(String message, Throwable cause) {
		super(message, cause);
	}

	public VoterGenericException(String message) {
		super(message);
	}

	public VoterGenericException(Throwable cause) {
		super(cause);
	}
	/**
	 * #### End of Constructors from the Super Class ####
	 */

}
