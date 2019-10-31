package org.manjunath.springboot.votersappwithswagger.exceptionhandling;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ErrorResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8500565909562697714L;

	private int errorCode;
	private String customErrorCode;
	private String customErrorMessage;
	private String errorMessage;
	private HttpStatus status;
	private String urlDetails;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private LocalDateTime timeStamp;

	public ErrorResponse() {
	}

	public ErrorResponse(int errorCode, String customErrorCode, String customErrorMessage, String errorMessage,
			HttpStatus status, String urlDetails, LocalDateTime timeStamp) {
		this.errorCode = errorCode;
		this.customErrorCode = customErrorCode;
		this.customErrorMessage = customErrorMessage;
		this.errorMessage = errorMessage;
		this.status = status;
		this.urlDetails = urlDetails;
		this.timeStamp = timeStamp;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getCustomErrorCode() {
		return customErrorCode;
	}

	public void setCustomErrorCode(String customErrorCode) {
		this.customErrorCode = customErrorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getCustomErrorMessage() {
		return customErrorMessage;
	}

	public void setCustomErrorMessage(String customErrorMessage) {
		this.customErrorMessage = customErrorMessage;
	}

	public String getUrlDetails() {
		return urlDetails;
	}

	public void setUrlDetails(String urlDetails) {
		this.urlDetails = urlDetails;
	}
}
