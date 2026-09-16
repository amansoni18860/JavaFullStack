package com.example.springMVC.controller;

import com.example.springMVC.model.StudentModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @GetMapping("/showForm")
    public String showForm(Model model) {

        StudentModel student = new StudentModel();

        model.addAttribute("student", student);

        return "student-form";
    }

    @PostMapping("/processForm")
    public String processForm(
            @ModelAttribute("student") StudentModel student) {

        System.out.println("========== FORM DATA ==========");
        System.out.println("First Name : " + student.getFirstName());
        System.out.println("Last Name  : " + student.getLastName());
        System.out.println("Country    : " + student.getCountry());
        System.out.println("Gender     : " + student.getGender());
        System.out.println("Languages  : " + student.getFavoriteLanguages());
        System.out.println("===============================");

        return "student-confirmation";
    }
}