package com.miniproject.app;

import java.util.List;

import com.miniproject.model.Employee;
import com.miniproject.report.EmployeeReport;
import com.miniproject.repository.EmployeeRepository;
import com.miniproject.service.EmployeeService;
import com.miniproject.utility.EmployeeUtility;

public class EmployeeManagementApplication implements EmployeeReport {

    // ═══════════════════════════════════════════════
    // Implement abstract method from EmployeeReport
    // ═══════════════════════════════════════════════
    @Override
    public void generateReport() {
        System.out.println("Employee Report Generated Successfully!");
    }

    // ═══════════════════════════════════════════════
    // Main Method
    // ═══════════════════════════════════════════════
    public static void main(String[] args) {

        // ── App Header ─────────────────────────────
        EmployeeUtility.printHeader();
        EmployeeReport.companyName();

        // ── Load Data ──────────────────────────────
        List<Employee> employees = 
                EmployeeRepository.getEmployee();

        // ── Initialize Service ─────────────────────
        EmployeeService service = 
                new EmployeeService(employees);

        // ── Functional Interface Demos ─────────────
        service.supplierDemo();
        service.consumerDemo();
        service.predicateDemo();
        service.functionDemo();
        service.constructorReferenceDemo();

        // ── Filtering & Sorting ────────────────────
        service.itEmployees();
        service.sortBySalary();

        // ── Aggregations ───────────────────────────
        service.employeeCount();
        service.highestSalary();
        service.averageSalary();
        service.totalSalary();

        // ── Grouping & Mapping ─────────────────────
        service.groupByDepartment();
        service.employeeNames();

        // ── Search & Reports ───────────────────────
        service.findEmployee(103);
        service.experienceReport();

        // ── App Footer ─────────────────────────────
        EmployeeUtility.printFooter();
    }
}