package com.example.rest.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

	@GetMapping("/")
	public String Home() {
		return "Hey Spring Boot User";
	}
}
