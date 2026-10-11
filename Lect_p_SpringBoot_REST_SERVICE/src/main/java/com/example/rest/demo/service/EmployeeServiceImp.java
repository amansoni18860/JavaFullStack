package com.example.rest.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.demo.DAO.EmployeeDAO;
import com.example.rest.demo.entity.Employee;

import jakarta.transaction.Transactional;


@Service
public class EmployeeServiceImp implements EmployeeService{

	private EmployeeDAO employeeDAO;
	
	@Autowired
	public EmployeeServiceImp(EmployeeDAO theEmployeeDAO) {
		employeeDAO=theEmployeeDAO;
	}
	
	@Override
	public List<Employee>findAll(){
		return employeeDAO.findAll();
	}

	@Override
	public Employee findById(int theId) {
		// TODO Auto-generated method stub
		return employeeDAO.findById(theId);
	}

	@Override
	@Transactional
	public Employee save(Employee theEmployee) {
		// TODO Auto-generated method stub
		return employeeDAO.save(theEmployee);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		  employeeDAO.deleteById(theId);
	}
}
