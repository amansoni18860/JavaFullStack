package com.example.lombok;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/emps")
    public Employee getEmp() {

        Employee emp = new Employee("John", 123);

        return emp;
    }
}