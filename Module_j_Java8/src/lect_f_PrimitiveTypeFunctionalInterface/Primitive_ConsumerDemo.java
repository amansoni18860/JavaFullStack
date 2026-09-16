package lect_f_PrimitiveTypeFunctionalInterface;

import java.util.ArrayList;
import java.util.function.IntConsumer;
import java.util.function.ObjDoubleConsumer;

// Employee class
class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class Primitive_ConsumerDemo {

    // Method to add employees to the ArrayList
    public static void populate(ArrayList<Employee> l) {

        l.add(new Employee("Raj", 10000));
        l.add(new Employee("Rohan", 15000));
        l.add(new Employee("Rani", 20000));
    }

    public static void main(String[] args) {

        /*
         * IntConsumer
         * Accepts an int value and returns nothing.
         *
         * Functional Method:
         * void accept(int value)
         */
        IntConsumer c = i ->
                System.out.println("The Square of i : " + (i * i));

        c.accept(10);

        // Create employee list
        ArrayList<Employee> l = new ArrayList<>();

        // Populate employee data
        populate(l);

        /*
         * ObjDoubleConsumer<T>
         *
         * Takes:
         * 1. Object of type T
         * 2. double value
         *
         * Returns nothing.
         *
         * Here:
         * Employee object + bonus amount
         */
        ObjDoubleConsumer<Employee> c2 =
                (e, d) -> e.salary = e.salary + d;

        // Add bonus of 500 to each employee
        for (Employee e : l) {
            c2.accept(e, 500.00);
        }

        // Display updated employee information
        for (Employee e : l) {

            System.out.println("Employee Name : " + e.name);
            System.out.println("Employee Salary : " + e.salary);
            System.out.println();
        }
    }
}