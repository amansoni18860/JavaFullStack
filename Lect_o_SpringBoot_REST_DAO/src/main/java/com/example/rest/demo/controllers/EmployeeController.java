package com.example.rest.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.demo.DAO.EmployeeDAO;
import com.example.rest.demo.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	private EmployeeDAO employeeDAO;
	
	public EmployeeController(EmployeeDAO theEmployeeDAO) {
		employeeDAO=theEmployeeDAO;
	}

	@GetMapping("/employees")
	public List<Employee>findAll(){
		return employeeDAO.findAll();
	}
}
