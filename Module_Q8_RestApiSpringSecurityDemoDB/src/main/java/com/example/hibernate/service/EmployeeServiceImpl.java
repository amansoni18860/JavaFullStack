package com.example.hibernate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hibernate.entity.Employee;
import com.example.hibernate.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	@Override 
	public Optional<Employee> findById(int id) {
		return employeeRepository.findById(id);
	}
	
	
	@Override
	@Transactional
	public Employee save(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	
	@Override
	@Transactional
	public void deleteById(int id) {
		employeeRepository.deleteById(id);
	}
}

