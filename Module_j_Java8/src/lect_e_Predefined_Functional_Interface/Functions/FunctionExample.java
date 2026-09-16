package lect_e_Predefined_Functional_Interface.Functions;

import java.util.ArrayList;
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

public class FunctionExample {

	public static void populate(ArrayList<Student> stu) {
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
		ArrayList<Student> stu = new ArrayList<>();
		populate(stu);

		Function<Student, String> f = s -> {
			int marks = s.marks;
			if (marks >= 80)
				return "A[Dictinction]";

			else if (marks >= 60)
				return "B[First Class]";

			else if (marks >= 50)
				return "C[Second Class]";

			else if (marks >= 35)
				return "D[Third Class]";
			
			else
				return "E[Failed]";
		};
		
		Predicate<Student>pred=s->s.marks>=60;
		
		for(Student s:stu) {
			
			if(pred.test(s)) {
				System.out.print("\n Student Name : "+s.name);
				System.out.print(" | Student Marks : "+s.marks);
				System.out.print(" | Student Grade : "+f.apply(s));
			
			}
		}
	}
}
