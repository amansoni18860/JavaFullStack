package com.example.springMVC.controller;

import com.example.springMVC.model.Student;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

	@GetMapping("/showForm")
	public String showForm(Model model) {

		model.addAttribute("student", new Student());

		return "student-form";
	}

	@PostMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "student-form";
		}

		System.out.println("========== STUDENT DATA ==========");
		System.out.println("First Name : " + student.getFirstName());
		System.out.println("Last Name  : " + student.getLastName());
		System.out.println("Age        : " + student.getAge());
		System.out.println("PostalCode : " + student.getPostalCode());
		System.out.println("CourseCode : " + student.getCourseCode());
		System.out.println("=============================*===");

		return "student-confirmation";
	}
}