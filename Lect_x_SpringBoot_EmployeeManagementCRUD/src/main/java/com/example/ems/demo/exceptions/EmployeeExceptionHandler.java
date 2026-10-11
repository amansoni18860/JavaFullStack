package com.example.ems.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<EmployeeErrorResponse>exceptionHandler(EmployeeNotFoundException ex){
		
		EmployeeErrorResponse err=new EmployeeErrorResponse();
		err.setMessage(ex.getMessage());
		err.setStatus(HttpStatus.NOT_FOUND.value());
		err.settStamp(System.currentTimeMillis());
		
		return new ResponseEntity<EmployeeErrorResponse>(
		        err,
		        HttpStatus.NOT_FOUND);	
		}
	
	@ExceptionHandler
	public ResponseEntity<EmployeeErrorResponse> handler2(Exception exe){
		
		EmployeeErrorResponse ser=new EmployeeErrorResponse();
		ser.setStatus(HttpStatus.BAD_REQUEST.value());
		ser.setMessage(exe.getMessage());
		ser.settStamp(System.currentTimeMillis());;
		
		return new ResponseEntity<EmployeeErrorResponse>(ser,HttpStatus.BAD_REQUEST);
	}
	

}
