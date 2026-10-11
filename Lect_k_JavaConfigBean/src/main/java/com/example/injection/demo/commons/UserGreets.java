package com.example.injection.demo.commons;

import org.springframework.stereotype.Component;

@Component
public class UserGreets implements Greets {

	public UserGreets() {
		System.out.println("In Constructor : "+getClass().getSimpleName());

	}
	
	@Override
	public String sayHello() {
		return "HELLO USER";
	}
}
