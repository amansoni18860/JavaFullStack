package lect_e_Predefined_Functional_Interface.Predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {

	String name;
	String designation;
	double salary;
	String city;

	Employee(String name, String designation, double salary, String city) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}

	@Override
	public String toString() {
		return String.format("(%s,%s,%.2f,%s))", name, designation, salary, city);
	}

	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		
		if(obj==null ||getClass()!=obj.getClass()) return false;
		
		Employee other=(Employee) obj;
		
		return this.name.equals(other.name)
			&& this.designation.equals(other.designation) 
			&&  this.salary==other.salary 
			&& this.city.equals(other.city);
		
	}
}

public class PredicateExample2 {

	public static void populate(ArrayList<Employee> list) {
		list.add(new Employee("Raj", "CEO", 30000, "Hyderabad"));
		list.add(new Employee("Mahesh", "Manager", 20000, "Bangalore"));
		list.add(new Employee("Ravi", "Developer", 15000, "Chennai"));
		list.add(new Employee("Kiran", "Tester", 12000, "Pune"));
		list.add(new Employee("Amit", "HR", 10000, "Mumbai"));
		list.add(new Employee("Suresh", "Team Lead", 25000, "Delhi"));
		list.add(new Employee("Priya", "Developer", 18000, "Bangalore"));
		list.add(new Employee("Anjali", "Manager", 22000, "Hyderabad"));
	}
	
	
	public static void display(Predicate<Employee>p,ArrayList<Employee>list) {
		for(Employee e:list) {
			if(p.test(e)) {
				System.out.println(e);
			}
		}
		System.out.println("\n*******************************************");
	}
	
	
	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<>();

		populate(list);

		Predicate<Employee>p1=emp->emp.designation.equals("Developer");
		System.out.println("Developer Information\n");
		display(p1,list);
		
		
		Predicate<Employee>p2=emp->emp.city.equals("Bangalore");
		System.out.println("Banglore Employees\n");
		display(p2,list);
		
		Predicate<Employee>p3=emp->emp.salary<20000;
		System.out.println("All employees information whose salary <20000");
		display(p3, list);
		
		
		Predicate<Employee>isCEO=Predicate.isEqual(new Employee("Raj", "CEO", 30000, "Hyderabad"));
		
		Employee e1=new Employee("Raj", "CEO", 30000, "Hyderabad");
		Employee e2=new Employee("Mahesh", "Manager", 20000, "Bangalore");
		System.out.println("Predicate isEqual Method");
		System.out.println(isCEO.test(e1));
		System.out.println(isCEO.test(e2));
		
		
	}
}
