package com.example.rest.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeRestExceptionHandler {
	@ExceptionHandler
	public ResponseEntity<EmployeeErrorResponse> exceptionHandler(EmployeeNotFoundException exc){
		
		EmployeeErrorResponse err=new EmployeeErrorResponse();
		
		err.setStatus(HttpStatus.NOT_FOUND.value());
		err.setMessage(exc.getMessage());
		err.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<EmployeeErrorResponse>(err,HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler
	public ResponseEntity<EmployeeErrorResponse> handleException2(Exception exc){
		
		EmployeeErrorResponse ser=new EmployeeErrorResponse();
		
		ser.setStatus(HttpStatus.BAD_REQUEST.value());
		ser.setMessage(exc.getMessage());
		ser.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<EmployeeErrorResponse>(ser,HttpStatus.BAD_REQUEST);
		
	}
}
