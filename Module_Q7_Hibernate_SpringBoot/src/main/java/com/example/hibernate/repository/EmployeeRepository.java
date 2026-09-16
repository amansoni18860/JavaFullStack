package com.example.hibernate.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import  com.example.hibernate.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}