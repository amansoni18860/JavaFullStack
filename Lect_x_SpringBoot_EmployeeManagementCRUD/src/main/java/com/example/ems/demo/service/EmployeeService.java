package com.example.ems.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.ems.demo.entity.Employee;

public interface EmployeeService {

	Optional<Employee> findById(int id);

	List<Employee> findAll();

	Employee save(Employee emp);

	void deleteById(int id);

}
