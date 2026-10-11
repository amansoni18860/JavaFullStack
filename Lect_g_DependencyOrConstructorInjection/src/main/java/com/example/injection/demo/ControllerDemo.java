package com.example.injection.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDemo {

	private Greets greet;

	@Autowired
	public ControllerDemo(Greets gre) {
		greet = gre;

	}

	@GetMapping("/")
	public String Home() {
		return greet.sayHello();
	}
}
