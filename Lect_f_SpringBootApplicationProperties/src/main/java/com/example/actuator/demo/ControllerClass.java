package com.example.actuator.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

	@Value("${author.name}")
	private String author;
	
	@Value("${author.address}")
	private String address;
	
	@GetMapping("/")
	public String Home() {
		return "Hello World, Author : "+author +", Address : "+address;
	}
	
	
	@GetMapping("/hi")
	public String Hi() {
		return "Hey Spring Boot Users";
	}
	
	@GetMapping("/by")
	public String By() {
		return "By Spring Boot User";
	}
}
