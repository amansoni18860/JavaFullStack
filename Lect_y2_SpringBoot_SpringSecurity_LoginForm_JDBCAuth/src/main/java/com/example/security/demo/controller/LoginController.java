package com.example.security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	@GetMapping("/showMyLoginPage")
	public String showMyLoginPage() {

	    System.out.println("Login2 Controller Called");

	    return "login2";
	}
	
	@GetMapping("/access-denied")
	public String showAccessDeniedPage() {


	    return "access-denied";
	}
}