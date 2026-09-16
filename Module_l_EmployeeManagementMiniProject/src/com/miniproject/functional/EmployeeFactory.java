package com.miniproject.functional;

import java.time.LocalDate;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import com.miniproject.model.Employee;

public class EmployeeFactory {

    // ═══════════════════════════════════════════════
    // Constructor Reference
    // Create Employee using constructor reference
    // ═══════════════════════════════════════════════
    public static Employee createEmployee(int id, String name,
                                           double salary,
                                           String department,
                                           LocalDate joiningDate) {
        return new Employee(id, name, salary, department, joiningDate);
    }

    // ═══════════════════════════════════════════════
    // Supplier - Creates a default Employee
    // ═══════════════════════════════════════════════
    public static Supplier<Employee> defaultEmployeeSupplier() {
        return () -> new Employee(
                0, "Unknown", 0.0,
                "N/A", LocalDate.now());
    }

    // ═══════════════════════════════════════════════
    // Function - Transform name to Employee
    // ═══════════════════════════════════════════════
    public static Function<String, Employee> nameToEmployee() {
        return name -> new Employee(
                0, name, 0.0,
                "N/A", LocalDate.now());
    }

    // ═══════════════════════════════════════════════
    // BiFunction - Create Employee from name & salary
    // ═══════════════════════════════════════════════
    public static BiFunction<String, Double, Employee> 
                                        createWithNameAndSalary() {
        return (name, salary) -> new Employee(
                0, name, salary,
                "N/A", LocalDate.now());
    }
}