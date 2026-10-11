package com.example.injection.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.injection.demo.commons.Greets;

@RestController
public class ControllerDemo {

	private Greets greet;

	@Autowired
	public void setGreet(@Qualifier("employeeGreet") Greets gre) {
		greet = gre;

	}

	@GetMapping("/")
	public String Home() {
		return greet.sayHello();
	}
}
