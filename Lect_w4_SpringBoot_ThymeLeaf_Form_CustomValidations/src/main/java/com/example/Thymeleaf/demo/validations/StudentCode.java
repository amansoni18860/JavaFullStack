package com.example.Thymeleaf.demo.validations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = StudentCodeConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface StudentCode {

	public String value()default "STU";
	
	public String message()default "must start with STU";
	
	public Class<?>[]groups()default{};
	
	public Class<? extends Payload>[] payload()default{};
	
}
