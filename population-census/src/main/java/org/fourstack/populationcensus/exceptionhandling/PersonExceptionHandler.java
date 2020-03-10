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

	
}
