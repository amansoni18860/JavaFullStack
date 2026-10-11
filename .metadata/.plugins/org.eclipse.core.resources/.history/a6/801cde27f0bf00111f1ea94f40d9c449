package com.example.Thymeleaf.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Thymeleaf.demo.entity.Student;

@Controller
public class StudentController {

    @GetMapping("/students")
    public String showStudents(Model model) {

        model.addAttribute("message", "Welcome to Thymeleaf");

        model.addAttribute("students",
                List.of(
                        new Student("Raj", "Singh", 21),
                        new Student("Priya", "Sharma", 22),
                        new Student("Amarpreet", "Kaur", 24)));

        model.addAttribute("showMessage", false);

        return "students";
    }
}