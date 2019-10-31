package org.manjunath.springboot.votersappwithswagger.exceptionhandling;

import java.time.LocalDateTime;

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
}
