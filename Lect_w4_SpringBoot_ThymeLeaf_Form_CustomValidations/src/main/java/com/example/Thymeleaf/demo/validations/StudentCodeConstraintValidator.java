package com.example.Thymeleaf.demo.validations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class StudentCodeConstraintValidator implements ConstraintValidator<StudentCode, String> {

	private String coursePrefix;

	@Override
	public void initialize(StudentCode theStudentCode) {
		coursePrefix = theStudentCode.value();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		boolean result=value.startsWith(coursePrefix);
		return result;
	}

}
