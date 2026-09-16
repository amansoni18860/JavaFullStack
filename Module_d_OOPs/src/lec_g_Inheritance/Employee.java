package lec_g_Inheritance;

public class Employee {

    private int eid;
    private String name;
    private double basic;

    private static String org = "Company";

    public void setEmp(int eid, String name, double basic) {
        this.eid = eid;
        this.name = name;
        this.basic = basic;
    }

    public void display() {
        System.out.println("Employee ID : " + eid);
        System.out.println("Name        : " + name);
        System.out.println("Basic Salary: " + basic);
        System.out.println("Organization: " + org);
    }
}