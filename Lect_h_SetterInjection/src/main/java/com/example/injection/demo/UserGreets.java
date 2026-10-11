package com.example.injection.demo;

import org.springframework.stereotype.Component;

@Component
public class UserGreets implements Greets {

	@Override
	public String sayHello() {
		return "HELLO USER";
	}
}
