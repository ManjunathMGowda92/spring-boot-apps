package org.fourstack.populationcensus.exceptionhandling;

/**
 * <p>
 * <b><i>PersonResultListNotFoundException</b></i> class is used when the result
 * list from the Database is empty.
 * </p>
 * 
 * @category RuntimeException
 * 
 * @author Manjunath HM
 *
 */
public class PersonResultListNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1938039274786505795L;

	/**
	 * #### Start of Constructors from the Super Class ####
	 */
	public PersonResultListNotFoundException() {
		super();
	}

	public PersonResultListNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PersonResultListNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public PersonResultListNotFoundException(String message) {
		super(message);
	}

	public PersonResultListNotFoundException(Throwable cause) {
		super(cause);
	}
	/**
	 * #### End of Constructors from Super Class ####
	 */
}
