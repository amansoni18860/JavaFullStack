package lect_e_Predefined_Functional_Interface.Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class ConsumerExample2 {

    public static void Populate(ArrayList<Student> stu) {
        stu.add(new Student("Raj", 22));
        stu.add(new Student("Priya", 35));
        stu.add(new Student("Amit", 48));
        stu.add(new Student("Sneha", 56));
        stu.add(new Student("Rahul", 63));
        stu.add(new Student("Neha", 71));
        stu.add(new Student("Vikram", 84));
        stu.add(new Student("Anjali", 90));
    }

    public static void main(String[] args) {

        ArrayList<Student> arr = new ArrayList<Student>();

        Populate(arr);

        Predicate<Student> pred = s -> s.marks >= 60;

        Function<Student, String> f = s -> {
            int marks = s.marks;

            if (marks >= 80) {
                return "A [Distinction]";
            } else if (marks >= 60) {
                return "B [First Class]";
            } else if (marks >= 50) {
                return "C [Second Class]";
            } else if (marks >= 35) {
                return "D [Third Class]";
            } else {
                return "E [Failed]";
            }
        };

        Consumer<Student> c = s -> {
            System.out.println("Student Name  : " + s.name);
            System.out.println("Student Marks : " + s.marks);
            System.out.println("Student Grade : " + f.apply(s));
            System.out.println();
        };

        // Apply Predicate and Consumer
        for (Student s : arr) {
            if (pred.test(s)) {
                c.accept(s);
            }
        }
    }
}