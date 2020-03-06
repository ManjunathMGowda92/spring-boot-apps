package org.fourstack.populationcensus.exceptionhandling;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2285351432026444920L;
	
	@JsonProperty("custom_err_code")
	private String customErrorCode;
	
	@JsonProperty("custom_err_msg")
	private String customErrorMsg;
	
	@JsonProperty("error_code")
	private String errorCode;
	
	@JsonProperty("error_messgae")
	private String errorMsg;
	
	@JsonProperty("http_status")
	private HttpStatus status;
	
	@JsonProperty("url_details")
	private String urlDetails;
	
	@JsonProperty("timestamp")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private LocalDateTime timeStamp;
	
	public ErrorResponse() {
	}

	public ErrorResponse(String customErrorCode, String customErrorMsg, String errorCode, String errorMsg,
			HttpStatus status, String urlDetails, LocalDateTime timeStamp) {
		super();
		this.customErrorCode = customErrorCode;
		this.customErrorMsg = customErrorMsg;
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		this.status = status;
		this.urlDetails = urlDetails;
		this.timeStamp = timeStamp;
	}

	public String getCustomErrorCode() {
		return customErrorCode;
	}

	public void setCustomErrorCode(String customErrorCode) {
		this.customErrorCode = customErrorCode;
	}

	public String getCustomErrorMsg() {
		return customErrorMsg;
	}

	public void setCustomErrorMsg(String customErrorMsg) {
		this.customErrorMsg = customErrorMsg;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getUrlDetails() {
		return urlDetails;
	}

	public void setUrlDetails(String urlDetails) {
		this.urlDetails = urlDetails;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
}