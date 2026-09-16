package com.example.springMVC.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

	String value() default "SPR";

	String message() default "Course code must start with SPR";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}