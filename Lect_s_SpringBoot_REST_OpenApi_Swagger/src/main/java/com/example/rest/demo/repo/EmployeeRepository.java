package com.example.rest.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rest.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
}
