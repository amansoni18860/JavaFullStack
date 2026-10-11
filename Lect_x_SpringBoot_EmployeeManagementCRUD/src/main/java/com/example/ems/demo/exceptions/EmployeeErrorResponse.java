package com.example.ems.demo.exceptions;

import java.sql.Timestamp;
import java.util.Date;

public class EmployeeErrorResponse {

	private String message;
	
	private int status;
	
	
	private long tStamp;
	
	public EmployeeErrorResponse() {
		
	}

	public EmployeeErrorResponse(String message, int status, long tStamp) {
		this.message = message;
		this.status = status;
		this.tStamp = tStamp;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public long gettStamp() {
		return tStamp;
	}

	public void settStamp(long tStamp) {
		this.tStamp = tStamp;
	}

	
	
	
}
