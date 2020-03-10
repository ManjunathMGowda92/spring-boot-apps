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
	private CustomErrorCodes customErrorMsg;
	
	@JsonProperty("custom_err_desc")
	private String customErrorDescription;
	
	@JsonProperty("error_code")
	private int errorCode;
	
	@JsonProperty("error_messgae")
	private String errorMsg;
	
	@JsonProperty("http_status")
	private HttpStatus status;
	
	@JsonProperty("url_details")
	private String urlDetails;
	
	@JsonProperty("timestamp")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
	private LocalDateTime timeStamp;
	
	public ErrorResponse() {
	}

	public ErrorResponse(String customErrorCode, CustomErrorCodes customErrorMsg, String customErrorDescription,
			int errorCode, String errorMsg, HttpStatus status, String urlDetails, LocalDateTime timeStamp) {
		this.customErrorCode = customErrorCode;
		this.customErrorMsg = customErrorMsg;
		this.customErrorDescription = customErrorDescription;
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

	public CustomErrorCodes getCustomErrorMsg() {
		return customErrorMsg;
	}

	public void setCustomErrorMsg(CustomErrorCodes customErrorMsg) {
		this.customErrorMsg = customErrorMsg;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
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

	public String getCustomErrorDescription() {
		return customErrorDescription;
	}

	public void setCustomErrorDescription(String customErrorDescription) {
		this.customErrorDescription = customErrorDescription;
	}
}