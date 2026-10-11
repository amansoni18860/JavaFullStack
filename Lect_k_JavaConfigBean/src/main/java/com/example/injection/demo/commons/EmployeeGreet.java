package com.example.injection.demo.commons;

import org.springframework.stereotype.Component;

@Component
public class EmployeeGreet implements Greets {
	
	public EmployeeGreet() {
		System.out.println("In Constructor : "+getClass().getSimpleName());

	}
	
	@Override
	public String sayHello() {
		return "HELLO Employee";
	}
}
