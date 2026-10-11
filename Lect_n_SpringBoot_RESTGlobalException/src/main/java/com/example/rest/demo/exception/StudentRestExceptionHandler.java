package com.example.rest.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> exceptionHandler(StudentNotFoundException exc){
		
		StudentErrorResponse err=new StudentErrorResponse();
		
		err.setStatus(HttpStatus.NOT_FOUND.value());
		err.setMessage(exc.getMessage());
		err.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<StudentErrorResponse>(err,HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException2(Exception exc){
		
		StudentErrorResponse ser=new StudentErrorResponse();
		
		ser.setStatus(HttpStatus.BAD_REQUEST.value());
		ser.setMessage(exc.getMessage());
		ser.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<StudentErrorResponse>(ser,HttpStatus.BAD_REQUEST);
		
	}
}
