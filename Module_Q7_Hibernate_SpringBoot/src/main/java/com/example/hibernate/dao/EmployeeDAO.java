package com.example.hibernate.dao;

import java.util.List;

import com.example.hibernate.entity.Employee;


public interface EmployeeDAO {

    Employee save(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    void deleteEmployee(Long id);

    List<Employee> findByNameLike(String name);

    List<Employee> findByDepartmentAndSalary(
            String department,
            Double salary);

    List<Employee> findByDepartmentOrSalary(
            String department,
            Double salary);

    List<Employee> salaryGreaterThan(Double salary);

    List<Employee> salaryBetween(
            Double min,
            Double max);

    List<Employee> orderByName();
}