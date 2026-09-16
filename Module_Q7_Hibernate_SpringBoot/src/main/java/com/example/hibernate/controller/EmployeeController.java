package com.example.hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.hibernate.dao.EmployeeDAO;
import com.example.hibernate.entity.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDAO;

    // Save Employee
    @PostMapping
    public Employee saveEmployee(
            @RequestBody Employee employee) {

        return employeeDAO.save(employee);
    }

    // Get All Employees
    @GetMapping
    public List<Employee> getAllEmployees() {

        return employeeDAO.getAllEmployees();
    }

    // Get Employee By Id
    @GetMapping("/{id}")
    public Employee getEmployeeById(
            @PathVariable Long id) {

        return employeeDAO.getEmployeeById(id);
    }

    // Delete Employee
    @DeleteMapping("/{id}")
    public String deleteEmployee(
            @PathVariable Long id) {

        employeeDAO.deleteEmployee(id);
        return "Employee Deleted Successfully";
    }

    // LIKE
    @GetMapping("/search")
    public List<Employee> searchByName(
            @RequestParam String name) {

        return employeeDAO.findByNameLike(name);
    }

    // AND
    @GetMapping("/and")
    public List<Employee> findByDepartmentAndSalary(
            @RequestParam String department,
            @RequestParam Double salary) {

        return employeeDAO.findByDepartmentAndSalary(
                department, salary);
    }

    // OR
    @GetMapping("/or")
    public List<Employee> findByDepartmentOrSalary(
            @RequestParam String department,
            @RequestParam Double salary) {

        return employeeDAO.findByDepartmentOrSalary(
                department, salary);
    }

    // Greater Than
    @GetMapping("/salary-greater")
    public List<Employee> salaryGreaterThan(
            @RequestParam Double salary) {

        return employeeDAO.salaryGreaterThan(salary);
    }

    // BETWEEN
    @GetMapping("/between")
    public List<Employee> salaryBetween(
            @RequestParam Double min,
            @RequestParam Double max) {

        return employeeDAO.salaryBetween(min, max);
    }

    // ORDER BY
    @GetMapping("/sort")
    public List<Employee> getEmployeesSorted() {

        return employeeDAO.orderByName();
    }

    // Load Sample Data
    @GetMapping("/load")
    public String loadData() {

        employeeDAO.save(
                new Employee("Aaj", "IT", 50000.0));

        employeeDAO.save(
                new Employee("Mahul", "HR", 40000.0));

        employeeDAO.save(
                new Employee("Lriya", "Finance", 60000.0));

        employeeDAO.save(
                new Employee("Sneha", "Admin", 35000.0));

        employeeDAO.save(
                new Employee("Bikram", "Sales", 55000.0));

        return "5 Records Inserted";
    }
}