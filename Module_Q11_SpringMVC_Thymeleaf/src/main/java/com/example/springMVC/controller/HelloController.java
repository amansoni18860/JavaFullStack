package com.example.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	@GetMapping("/showForm")
	public String showForm() {
		return "hello-form";
	}

	
	@PostMapping("/processForm")
	public String processForm(@RequestParam("studentName") String name,Model model) {
		model.addAttribute("name",name.toUpperCase());
		return "result";
	}
}
