package com.miniproject.model;

import java.time.LocalDate;

public class Employee {

    // ═══════════════════════════════
    // Fields
    // ═══════════════════════════════
    private int id;
    private String name;
    private double salary;
    private String department;
    private LocalDate joiningDate;

    // ═══════════════════════════════
    // Constructor
    // ═══════════════════════════════
    public Employee(int id, String name, 
                    double salary, String department, 
                    LocalDate joiningDate) {
        this.id         = id;
        this.name       = name;
        this.salary     = salary;
        this.department = department;
        this.joiningDate = joiningDate;
    }

    // ═══════════════════════════════
    // Getters & Setters
    // ═══════════════════════════════
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }
    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    // ═══════════════════════════════
    // toString
    // ═══════════════════════════════
    @Override
    public String toString() {
        return "Employee{" +
                "id="          + id          +
                ", name='"     + name        + '\'' +
                ", salary="    + salary      +
                ", department='"+ department + '\'' +
                ", joiningDate="+ joiningDate+
                '}';
    }
}