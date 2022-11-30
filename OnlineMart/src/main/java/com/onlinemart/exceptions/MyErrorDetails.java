package com.onlinemart.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyErrorDetails {
	
	private LocalDateTime timeStamp;
	private String message;
	private HttpStatus httpStatus;
	private String details;
	
	public MyErrorDetails() {
		// TODO Auto-generated constructor stub
	}

	public MyErrorDetails(LocalDateTime timeStamp, String message, HttpStatus httpStatus, String details) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
		this.httpStatus = httpStatus;
		this.details = details;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "MyErrorDetails [timeStamp=" + timeStamp + ", message=" + message + ", httpStatus=" + httpStatus
				+ ", details=" + details + "]";
	}
	

}
