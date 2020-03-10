package org.fourstack.populationcensus.exceptionhandling;

import java.time.LocalDateTime;

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
		response.setCustomErrorCode(CustomErrorCodes.PERSON_NOT_FOUND.custErrorCode());
		response.setCustomErrorMsg(CustomErrorCodes.PERSON_NOT_FOUND);
		response.setCustomErrorDescription(CustomErrorCodes.PERSON_NOT_FOUND.custErrorMsg());
		
		response.setErrorCode(HttpStatus.NOT_FOUND.value());
		response.setErrorMsg(exception.getMessage());
		response.setStatus(HttpStatus.NOT_FOUND);
		
		response.setTimeStamp(LocalDateTime.now());
		response.setUrlDetails(request.getDescription(false));
		
		return new ResponseEntity<ErrorResponse>(response, HttpStatus.NOT_FOUND);
	}
}
