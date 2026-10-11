package com.example.rest.demo.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.demo.DAO.EmployeeDAO;
import com.example.rest.demo.entity.Employee;
import com.example.rest.demo.exception.EmployeeNotFoundException;
import com.example.rest.demo.service.EmployeeService;

import tools.jackson.databind.json.JsonMapper;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	private JsonMapper jsonMapper;
	
	@Autowired
	public EmployeeController(EmployeeService theEmployeeService, JsonMapper theJsonMapper) {
		employeeService=theEmployeeService;
		jsonMapper=theJsonMapper;
	}

	@GetMapping("/employees")
	public List<Employee>findAll(){
		return employeeService.findAll();
	}
	
	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId)
	{
		Employee theEmployee=employeeService.findById(employeeId);
		if(theEmployee==null)
			throw new EmployeeNotFoundException("Employee id not found - "+employeeId);
		
		return theEmployee;
	}
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee theEmployee)
	{
		
		theEmployee.setId(0);
		Employee dbEmployee=employeeService.save(theEmployee);
		return dbEmployee;
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee theEmployee) {
		
		Employee dbEmployee=employeeService.save(theEmployee);
		return dbEmployee;
	}
	
	@PatchMapping("/employees/{employeeId}")
	public Employee patchEmployee(@PathVariable int employeeId, @RequestBody Map<String,Object>patchPayload)
	{
		Employee tempEmployee=employeeService.findById(employeeId);
		
		if(tempEmployee==null) {
			throw new EmployeeNotFoundException("Employee id not found : "+employeeId);
		}
		
		if(patchPayload.containsKey("id"))
			throw new EmployeeNotFoundException("Employee Id is not allowed in request body - "+employeeId);
		
		Employee patchedEmployee=jsonMapper.updateValue(tempEmployee,patchPayload);
		
		Employee dbEmployee=employeeService.save(patchedEmployee);
		return dbEmployee;
	}
	
	
	@DeleteMapping("/employee/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId) {
		
		Employee tempEmployee =employeeService.findById(employeeId);
		
		if(tempEmployee==null) throw new EmployeeNotFoundException("Employee id not found - "+employeeId);
		
		employeeService.deleteById(employeeId);
		
		return "Delete employee id - "+employeeId;
	}
	
}
