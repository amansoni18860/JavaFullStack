package com.example.injection.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.injection.demo.commons.Greets;

@RestController
public class ControllerDemo {

	private Greets greet;
	private Greets anotherGreet;

	@Autowired
	public void setGreet(@Qualifier("managerGreet") Greets gre,
			@Qualifier("managerGreet") Greets gre2) {
		greet = gre;
		anotherGreet=gre2;

	}

	@GetMapping("/")
	public String Home() {
		return greet.sayHello();
		
	}
	
	@GetMapping("/check")
	public String check() {
		return "Comparing Beans: greet==anothergreet, "+(greet==anotherGreet);
	}
}
