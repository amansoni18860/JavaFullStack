package com.example.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hibernate.dao.EmployeeDAO;
import com.example.hibernate.entity.Employee;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeedao;
	
	@Override
	public List<Employee> findAll(){
		return employeedao.findAll();
	}
	
	@Override 
	public Employee findById(int id) {
		return employeedao.findById(id);
	}
	
	
	@Override
	@Transactional
	public Employee save(Employee employee) {
		return employeedao.save(employee);
	}
	
	
	@Override
	@Transactional
	public void deleteById(int id) {
		employeedao.deleteById(id);
	}
}

