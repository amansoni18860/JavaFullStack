package com.example.ems.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ems.demo.entity.Employee;
import com.example.ems.demo.service.EmployeeService;

@Controller
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    
    @GetMapping("/")
    public String home() {

        return "index";
    }

    

    @GetMapping("/employees")
    public String listEmployees(Model model) {

        model.addAttribute("employees",
                employeeService.findAll());

        return "employees/list-employees";
    }

    @GetMapping("/employees/showFormForAdd")
    public String showFormForAdd(Model model) {

        Employee employee = new Employee();

        model.addAttribute("employee", employee);

        return "employees/employee-form";
    }

    @PostMapping("/employees/save")
    public String saveEmployee(
            @ModelAttribute("employee") Employee employee) {

        employeeService.save(employee);

        return "redirect:/employees";
    }

    
    @GetMapping("/employees/delete")
    public String deleteEmployee(
            @RequestParam("employeeId") int employeeId) {

        employeeService.deleteById(employeeId);

        return "redirect:/employees";
    }
}