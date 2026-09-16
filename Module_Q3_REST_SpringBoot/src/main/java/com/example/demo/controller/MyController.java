package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MyController {

	@GetMapping("/hello" )
	public String sayHello() {
		return "Hello World";
	}
	
	@GetMapping("/hi")
	public String sayHi() {
		return "Hi Spring Boot";
	}
}
