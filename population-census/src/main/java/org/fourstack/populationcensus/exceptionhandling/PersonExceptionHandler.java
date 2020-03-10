package org.fourstack.populationcensus.exceptionhandling;

import java.time.LocalDateTime;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * <p>
 * <b><i>PersonExceptionHandler</i></b> class, is an Exception Handler class,
 * which is used to handle the exceptions that occurred for the Census
 * Application.
 * </p>
 * 
 * @author Manjunath HM
 *
 */
@ControllerAdvice
public class PersonExceptionHandler extends ResponseEntityExceptionHandler {

	/**
	 * Exception Handler method to handle the PersonNotFoundException.
	 * <p>
	 * When PersonNotFoundException occurs, error response will be generated and
	 * send back to the requester
	 * </p>
	 * 
	 * @param exception Type of Exception is handled
	 * @param request   WebRequest
	 * @return ErrorResponse Entity
	 */
	@ExceptionHandler(value = PersonNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleErrorResponse(PersonNotFoundException exception, WebRequest request) {
		ErrorResponse response = new ErrorResponse();
		response.setCustomErrorCode(CustomErrorCodes.PERSON_NOT_FOUND.code());
		response.setCustomErrorMsg(CustomErrorCodes.PERSON_NOT_FOUND);
		response.setCustomErrorDescription(CustomErrorCodes.PERSON_NOT_FOUND.value());

		response.setErrorCode(HttpStatus.NOT_FOUND.value());
		response.setErrorMsg(exception.getMessage());
		response.setStatus(HttpStatus.NOT_FOUND);

		response.setTimeStamp(LocalDateTime.now());
		response.setUrlDetails(request.getDescription(false));

		return new ResponseEntity<ErrorResponse>(response, HttpStatus.NOT_FOUND);
	}

	/**
	 * Exception Handler method to handle the PersonResultListNotFoundException
	 * <p>
	 * When PersonResultListNotFoundException occurs, error response will be
	 * generated and send back to the requester
	 * </p>
	 * 
	 * @param exception Type of Exception Handled
	 * @param request   WebRequest
	 * @return ErrorResponse Entity
	 */
	@ExceptionHandler(PersonResultListNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleErrorResponse(PersonResultListNotFoundException exception,
			WebRequest request) {
		ErrorResponse response = new ErrorResponse();
		response.setCustomErrorCode(CustomErrorCodes.PERSONS_LIST_NOT_FOUND.code());
		response.setCustomErrorMsg(CustomErrorCodes.PERSONS_LIST_NOT_FOUND);
		response.setCustomErrorDescription(CustomErrorCodes.PERSONS_LIST_NOT_FOUND.value());

		response.setErrorCode(HttpStatus.NOT_FOUND.value());
		response.setErrorMsg(exception.getMessage());
		response.setStatus(HttpStatus.NOT_FOUND);

		response.setTimeStamp(LocalDateTime.now());
		response.setUrlDetails(request.getDescription(false));

		return new ResponseEntity<ErrorResponse>(response, HttpStatus.NOT_FOUND);
	}

	/**
	 * Exception handler method to handle DataIntegrityViolationException.
	 * <p>
	 * When DataIntegrityViolationException occurs, error response will be generated
	 * and send back to the requester
	 * </p>
	 * 
	 * @param exception Type of Exception need to be handled
	 * @param request   WebRequest
	 * @return ErrorResponse Entity
	 */
	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<ErrorResponse> handleErrorResponse(DataIntegrityViolationException exception,
			WebRequest request) {
		ErrorResponse response = new ErrorResponse();
		response.setCustomErrorCode(CustomErrorCodes.CONSTRAINT_VALIDATION_ERROR.code());
		response.setCustomErrorMsg(CustomErrorCodes.CONSTRAINT_VALIDATION_ERROR);
		response.setCustomErrorDescription(CustomErrorCodes.CONSTRAINT_VALIDATION_ERROR.value());

		response.setErrorCode(HttpStatus.BAD_REQUEST.value());
		response.setErrorMsg(exception.getMessage());
		response.setStatus(HttpStatus.BAD_REQUEST);

		response.setTimeStamp(LocalDateTime.now());
		response.setUrlDetails(request.getDescription(false));

		return new ResponseEntity<ErrorResponse>(response, HttpStatus.BAD_REQUEST);
	}

	/**
	 * Exception Handler Method to handle the Generic Exceptions.
	 * 
	 * @param exception Type of Exception is handled
	 * @param request   WebRequest
	 * @return ErrorResponse Entity
	 */
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> handleErrorResponse(Exception exception, WebRequest request) {
		ErrorResponse response = new ErrorResponse();
		response.setCustomErrorCode(CustomErrorCodes.CENSUS_GENERIC_ERROR.code());
		response.setCustomErrorMsg(CustomErrorCodes.CENSUS_GENERIC_ERROR);
		response.setCustomErrorDescription(CustomErrorCodes.CENSUS_GENERIC_ERROR.value());

		response.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		response.setErrorMsg(exception.getMessage());
		response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);

		response.setTimeStamp(LocalDateTime.now());
		response.setUrlDetails(request.getDescription(false));

		return new ResponseEntity<ErrorResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
