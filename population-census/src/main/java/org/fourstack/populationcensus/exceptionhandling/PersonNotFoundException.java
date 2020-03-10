package org.fourstack.populationcensus.exceptionhandling;

/**
 * <p>
 * <b><i>PersonNotFoundException</b></i> class is used when the particular
 * Person object not found in the Database.
 * </p>
 * 
 * @author Manjunath HM
 *
 * @category RuntimeException
 */
public class PersonNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2487017357815402014L;

	/**
	 * #### Start of Constructors from Super Class ####
	 */
	public PersonNotFoundException() {
		super();
	}

	public PersonNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PersonNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public PersonNotFoundException(String message) {
		super(message);
	}

	public PersonNotFoundException(Throwable cause) {
		super(cause);
	}
	/**
	 * #### End of Constructors from Super Class ####
	 */
}
