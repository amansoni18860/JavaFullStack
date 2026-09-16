package com.example.hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hibernate.entity.Employee;
import com.example.hibernate.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/employees")
	public List<Employee>getEmployees(){
		return empService.findAll();
	}
	
	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee (@PathVariable int employeeId) {
		return empService.findById(employeeId);
	}
	
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee emp) {
		Employee dbEmp =empService.save(emp);
		return dbEmp;
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee emp) {
		Employee dbEmp=empService.save(emp);
		return dbEmp;
	}
	
	@DeleteMapping("employees/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId) {
		Employee tempEmp=empService.findById(employeeId);
		if(tempEmp==null) {
			throw new RuntimeException("Employee Id not Found : "+employeeId);
		}else
			empService.deleteById(employeeId);
		return "Employee with ID : " +employeeId+" deleted";
	}
	
	

}
