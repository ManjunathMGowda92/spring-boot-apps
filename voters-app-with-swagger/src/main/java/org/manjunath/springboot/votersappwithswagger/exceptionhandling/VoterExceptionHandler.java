package org.manjunath.springboot.votersappwithswagger.exceptionhandling;

import java.time.LocalDateTime;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * VoterExceptionHandler class is an Exception handler which is used to handle
 * the exceptions occurred for Voter application
 * 
 * @author Manjunath HM
 *
 */
@ControllerAdvice
public class VoterExceptionHandler extends ResponseEntityExceptionHandler {

	/**
	 * Method handleErrorResponse(..) is an overloaded method. It handles the
	 * Exceptions of type VoterNotFoundException. VoterNotFoundException will be
	 * thrown when there is no entry for the Voters.
	 * 
	 * @param exception
	 *            Exception of type VoterNotFoundException
	 * @param request
	 *            WebRequest
	 * @return ResponseEntity for ErrorResponse
	 */
	@ExceptionHandler(value = VoterNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleErrorResponse(VoterNotFoundException exception, WebRequest request) {

		ErrorResponse response = new ErrorResponse();
		response.setCustomErrorCode(CustomErrorCodes.VOTER_NOT_FOUND_CODE);
		response.setCustomErrorMessage(CustomErrorCodes.VOTER_NOT_FOUND_MSG);
		response.setErrorCode(HttpStatus.NOT_FOUND.value());
		response.setErrorMessage(exception.getMessage());
		response.setStatus(HttpStatus.NOT_FOUND);
		response.setTimeStamp(LocalDateTime.now());
		response.setUrlDetails(request.getDescription(false));

		return new ResponseEntity<ErrorResponse>(response, HttpStatus.NOT_FOUND);
	}

	/**
	 * Method handleErrorResponse(..) is an overloaded method. It handles the
	 * Exceptions of type Exception.class. This for handling the Generic
	 * Exceptions
	 * 
	 * @param exception
	 *            Exception of type Exception
	 * @param request
	 *            WebRequest
	 * @return ResponseEntity for ErrorResponse
	 */
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ErrorResponse> handleErrorResponse(Exception exception, WebRequest request) {
		ErrorResponse response = new ErrorResponse(HttpStatus.BAD_REQUEST.value(),
				CustomErrorCodes.VOTER_GENERIC_EXCEPTION_CODE, CustomErrorCodes.VOTER_GENERIC_EXCEPTION_MSG,
				exception.getMessage(), HttpStatus.BAD_REQUEST, request.getDescription(false), LocalDateTime.now());

		return new ResponseEntity<ErrorResponse>(response, HttpStatus.BAD_REQUEST);
	}

	/**
	 * Method handleErrorResponse(..) is an overloaded method. It handles the
	 * Exceptions of type NullPointerException.class. This for handling the
	 * NullPointer Exceptions
	 * 
	 * @param exception
	 *            Exception of type NullPointerException
	 * @param request
	 *            WebRequest
	 * @return ResponseEntity for ErrorResponse
	 */
	@ExceptionHandler(value = NullPointerException.class)
	public ResponseEntity<ErrorResponse> handleErrorResponse(NullPointerException exception, WebRequest request) {
		ErrorResponse response = new ErrorResponse(HttpStatus.BAD_REQUEST.value(),
				CustomErrorCodes.VOTER_NULL_EXCEPTION_CODE, CustomErrorCodes.VOTER_NULL_EXCEPTION_MSG,
				exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR, request.getDescription(false),
				LocalDateTime.now());

		return new ResponseEntity<ErrorResponse>(response, HttpStatus.BAD_REQUEST);
	}

	/**
	 * Method handleErrorResponse(..) is an overloaded method. It handles the
	 * Exceptions of type DataIntegrityViolationException.class. This for
	 * handling the Data Integrity Violation(Unique Constraints) Exceptions
	 * 
	 * @param exception
	 *            Exception of type DataIntegrityViolationException
	 * @param request
	 *            WebRequest
	 * @return ResponseEntity for ErrorResponse
	 */
	@ExceptionHandler(value = DataIntegrityViolationException.class)
	public ResponseEntity<ErrorResponse> handleErrorResponse(DataIntegrityViolationException exception,
			WebRequest request) {
		ErrorResponse response = new ErrorResponse();
		response.setErrorCode(HttpStatus.CONFLICT.value());
		response.setCustomErrorCode(CustomErrorCodes.VOTER_CONSTARINT_EXCEPTION_CODE);
		response.setCustomErrorMessage(CustomErrorCodes.VOTER_CONSTARINT_EXCEPTION_MSG);
		response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
		response.setTimeStamp(LocalDateTime.now());
		response.setUrlDetails(request.getDescription(false));
		
		String exceptionMsg = exception.getMessage();
		if (exceptionMsg.indexOf("SQL statement") > -1)
			exceptionMsg = exceptionMsg.substring(0, exceptionMsg.indexOf("SQL statement"));
		
		response.setErrorMessage(exceptionMsg);
		
		return new ResponseEntity<ErrorResponse>(response, HttpStatus.CONFLICT);
	}
}
