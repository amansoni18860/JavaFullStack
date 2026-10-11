package com.example.rest.demo.service;

import java.util.List;

import com.example.rest.demo.entity.Employee;

public interface EmployeeService {

	List<Employee> findAll();

	Employee findById(int theId);

	Employee save(Employee theEmployee);

	void deleteById(int theId);
}
