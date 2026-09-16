package com.miniproject.repository;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.miniproject.model.Employee;

public class EmployeeRepository {

    public static List<Employee> getEmployee() {
        return Arrays.asList(

            // ── IT Department ──────────────────────────
            new Employee(101, "Raj",     75000, "IT",
                         LocalDate.of(2020, 5,  15)),
            new Employee(102, "Nagesh",  62000, "IT",
                         LocalDate.of(2021, 2,  20)),
            new Employee(103, "Priya",   88000, "IT",
                         LocalDate.of(2019, 8,  10)),

            // ── HR Department ──────────────────────────
            new Employee(104, "Anjali",  55000, "HR",
                         LocalDate.of(2022, 1,   5)),
            new Employee(105, "Vikram",  48000, "HR",
                         LocalDate.of(2023, 3,  18)),

            // ── Finance Department ─────────────────────
            new Employee(106, "Suresh",  92000, "Finance",
                         LocalDate.of(2018, 11, 25)),
            new Employee(107, "Meena",   67000, "Finance",
                         LocalDate.of(2020, 7,  30)),

            // ── Sales Department ───────────────────────
            new Employee(108, "Arjun",   58000, "Sales",
                         LocalDate.of(2021, 9,  12)),
            new Employee(109, "Kavya",   71000, "Sales",
                         LocalDate.of(2019, 6,   8)),

            // ── Marketing Department ───────────────────
            new Employee(110, "Rohit",   64000, "Marketing",
                         LocalDate.of(2022, 4,  22)),
            new Employee(111, "Sneha",   53000, "Marketing",
                         LocalDate.of(2023, 10,  1)),

            // ── Operations Department ──────────────────
            new Employee(112, "Karthik", 79000, "Operations",
                         LocalDate.of(2017, 12,  3)),
            new Employee(113, "Divya",   85000, "Operations",
                         LocalDate.of(2020, 2,  14))
        );
    }
}