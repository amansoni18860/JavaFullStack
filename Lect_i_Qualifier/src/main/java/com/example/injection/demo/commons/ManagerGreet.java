package com.example.injection.demo.commons;

import org.springframework.stereotype.Component;

@Component
public class ManagerGreet implements Greets {
	@Override
	public String sayHello() {
		return "HELLO Manager";
	}
}
