package com.example.rest.demo.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.demo.entity.Employee;
import com.example.rest.demo.exception.EmployeeNotFoundException;
import com.example.rest.demo.service.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private EmployeeService employeeService;

    private ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    public EmployeeController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId) {

        return employeeService.findById(employeeId)
                .orElseThrow(() ->
                        new EmployeeNotFoundException(
                                "Employee id not found - " + employeeId));
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee) {

        theEmployee.setId(0);

        return employeeService.save(theEmployee);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee) {

        return employeeService.save(theEmployee);
    }

    @PatchMapping("/employees/{employeeId}")
    public Employee patchEmployee(
            @PathVariable int employeeId,
            @RequestBody Map<String, Object> patchPayload) {

        Employee tempEmployee = employeeService.findById(employeeId)
                .orElseThrow(() ->
                        new EmployeeNotFoundException(
                                "Employee id not found - " + employeeId));

        if (patchPayload.containsKey("id")) {
            throw new RuntimeException(
                    "Employee id is not allowed in request body");
        }

        try {

            Employee patchedEmployee =
                    objectMapper.updateValue(
                            tempEmployee,
                            patchPayload);

            return employeeService.save(patchedEmployee);

        } catch (Exception e) {
            throw new RuntimeException(
                    "Error while patching employee", e);
        }
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId) {

        employeeService.findById(employeeId)
                .orElseThrow(() ->
                        new EmployeeNotFoundException(
                                "Employee id not found - " + employeeId));

        employeeService.deleteById(employeeId);

        return "Deleted employee id - " + employeeId;
    }
}