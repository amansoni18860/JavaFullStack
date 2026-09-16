package com.miniproject.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.miniproject.functional.EmployeeFactory;
import com.miniproject.model.Employee;

public class EmployeeService {

    // ═══════════════════════════════
    // Fields
    // ═══════════════════════════════
    private List<Employee> employees;

    // ═══════════════════════════════
    // Constructor
    // ═══════════════════════════════
    public EmployeeService(List<Employee> employees) {
        this.employees = employees;
    }

    // ═══════════════════════════════════════════════
    // 1. Supplier Demo
    // ═══════════════════════════════════════════════
    public void supplierDemo() {
        System.out.println("\n═══ Supplier Demo ═══");

        // Supplier provides a value without input
        Supplier<Employee> supplier = 
                EmployeeFactory.defaultEmployeeSupplier();

        Employee defaultEmp = supplier.get();
        System.out.println("Default Employee: " + defaultEmp);
    }

    // ═══════════════════════════════════════════════
    // 2. Consumer Demo
    // ═══════════════════════════════════════════════
    public void consumerDemo() {
        System.out.println("\n═══ Consumer Demo ═══");

        // Consumer accepts a value and performs an action
        Consumer<Employee> printEmployee = emp ->
                System.out.println(
                    "ID: "   + emp.getId()         +
                    " | Name: " + emp.getName()    +
                    " | Dept: " + emp.getDepartment());

        System.out.println("All Employees:");
        employees.forEach(printEmployee);
    }

    // ═══════════════════════════════════════════════
    // 3. Predicate Demo
    // ═══════════════════════════════════════════════
    public void predicateDemo() {
        System.out.println("\n═══ Predicate Demo ═══");

        // Predicate tests a condition
        Predicate<Employee> isIT       = 
                emp -> emp.getDepartment().equals("IT");
        Predicate<Employee> highSalary = 
                emp -> emp.getSalary() > 70000;

        System.out.println("IT Employees with Salary > 70000:");
        employees.stream()
                 .filter(isIT.and(highSalary))
                 .forEach(emp -> System.out.println(
                     "  → " + emp.getName() + 
                     " | $" + emp.getSalary()));
    }

    // ═══════════════════════════════════════════════
    // 4. Function Demo
    // ═══════════════════════════════════════════════
    public void functionDemo() {
        System.out.println("\n═══ Function Demo ═══");

        // Function transforms input to output
        Function<Employee, String> empToString = emp ->
                emp.getName() + " (" + emp.getDepartment() + ")";

        System.out.println("Employee Summary:");
        employees.stream()
                 .map(empToString)
                 .forEach(s -> System.out.println("  → " + s));
    }

    // ═══════════════════════════════════════════════
    // 5. Constructor Reference Demo
    // ═══════════════════════════════════════════════
    public void constructorReferenceDemo() {
        System.out.println("\n═══ Constructor Reference Demo ═══");

        Employee emp = EmployeeFactory.createEmployee(
                999, "TestUser", 50000,
                "IT", LocalDate.of(2024, 1, 1));

        System.out.println("Created via Factory: " + emp);
    }

    // ═══════════════════════════════════════════════
    // 6. IT Employees
    // ═══════════════════════════════════════════════
    public void itEmployees() {
        System.out.println("\n═══ IT Department Employees ═══");

        employees.stream()
                 .filter(emp -> emp.getDepartment().equals("IT"))
                 .forEach(emp -> System.out.println(
                     "  → " + emp.getName() + 
                     " | $" + emp.getSalary()));
    }

    // ═══════════════════════════════════════════════
    // 7. Sort by Salary
    // ═══════════════════════════════════════════════
    public void sortBySalary() {
        System.out.println("\n═══ Employees Sorted by Salary ═══");

        employees.stream()
                 .sorted(Comparator.comparingDouble(
                         Employee::getSalary).reversed())
                 .forEach(emp -> System.out.printf(
                     "  → %-10s | $%.0f%n",
                     emp.getName(), emp.getSalary()));
    }

    // ═══════════════════════════════════════════════
    // 8. Employee Count
    // ═══════════════════════════════════════════════
    public void employeeCount() {
        System.out.println("\n═══ Employee Count ═══");

        long count = employees.stream().count();
        System.out.println("Total Employees: " + count);
    }

    // ═══════════════════════════════════════════════
    // 9. Highest Salary
    // ═══════════════════════════════════════════════
    public void highestSalary() {
        System.out.println("\n═══ Highest Salary ═══");

        Optional<Employee> max = employees.stream()
                .max(Comparator.comparingDouble(
                        Employee::getSalary));

        max.ifPresent(emp -> System.out.println(
            "Highest Paid: " + emp.getName() + 
            " | $"           + emp.getSalary() +
            " | Dept: "      + emp.getDepartment()));
    }

    // ═══════════════════════════════════════════════
    // 10. Average Salary
    // ═══════════════════════════════════════════════
    public void averageSalary() {
        System.out.println("\n═══ Average Salary ═══");

        OptionalDouble avg = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average();

        avg.ifPresent(a -> 
            System.out.printf("Average Salary: $%.2f%n", a));
    }

    // ═══════════════════════════════════════════════
    // 11. Group by Department
    // ═══════════════════════════════════════════════
    public void groupByDepartment() {
        System.out.println("\n═══ Employees Grouped by Department ═══");

        Map<String, List<Employee>> grouped = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment));

        grouped.forEach((dept, empList) -> {
            System.out.println("\n  📂 " + dept + ":");
            empList.forEach(emp -> System.out.println(
                "     → " + emp.getName() + 
                " | $"    + emp.getSalary()));
        });
    }

    // ═══════════════════════════════════════════════
    // 12. Employee Names
    // ═══════════════════════════════════════════════
    public void employeeNames() {
        System.out.println("\n═══ All Employee Names ═══");

        List<String> names = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println("Names: " + names);
    }

    // ═══════════════════════════════════════════════
    // 13. Total Salary
    // ═══════════════════════════════════════════════
    public void totalSalary() {
        System.out.println("\n═══ Total Salary ═══");

        double total = employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();

        System.out.printf("Total Salary Expense: $%.0f%n", total);
    }

    // ═══════════════════════════════════════════════
    // 14. Find Employee by ID
    // ═══════════════════════════════════════════════
    public void findEmployee(int id) {
        System.out.println("\n═══ Find Employee (ID: " + id + ") ═══");

        Optional<Employee> found = employees.stream()
                .filter(emp -> emp.getId() == id)
                .findFirst();

        found.ifPresentOrElse(
            emp -> System.out.println(
                "Found: " + emp.getName() +
                " | Dept: " + emp.getDepartment() +
                " | $" + emp.getSalary()),
            () -> System.out.println(
                "No employee found with ID: " + id));
    }

    // ═══════════════════════════════════════════════
    // 15. Experience Report
    // ═══════════════════════════════════════════════
    public void experienceReport() {
        System.out.println("\n═══ Experience Report ═══");

        System.out.printf("%-12s %-12s %-15s %-10s%n",
                "ID", "Name", "Department", "Experience");
        System.out.println("─".repeat(52));

        employees.stream()
                 .sorted(Comparator.comparing(
                         Employee::getJoiningDate))
                 .forEach(emp -> {
                     Period period = Period.between(
                             emp.getJoiningDate(),
                             LocalDate.now());
                     System.out.printf(
                         "%-12d %-12s %-15s %d yrs %d mos%n",
                         emp.getId(),
                         emp.getName(),
                         emp.getDepartment(),
                         period.getYears(),
                         period.getMonths());
                 });
    }
}