package com.example.rest.demo.DAO;

import java.util.List;

import com.example.rest.demo.entity.Employee;

public interface EmployeeDAO {

	List<Employee> findAll();
}
