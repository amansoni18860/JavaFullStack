package problem6;

public class Member {

	String name;
	int age;
	String phoneNumber;
	String address;
	double salary;

	public Member(String name, int age, String phoneNumber, String address, double salary) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;

	}

	public void printSalary() {
		System.out.println("Salary: "+salary);
	}
	
}


class Employee extends Member{
	String specialization;
	
	public Employee(String name,int age,String phoneNumber,String address,double salary,String specialization) {
		super(name,age,phoneNumber,address,salary);
		this.specialization=specialization;
	}
	
	public void displayDetails() {
		System.out.println("----------Employee Details---------------------");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phone: "+phoneNumber);
        System.out.println("Address: "+address);
        System.out.println("Specialization: "+specialization);
        printSalary();
        System.out.println();
	}
}



class Manager extends Member{
	String department;
	
	public Manager(String name,int age,String phoneNumber,String address,double salary,String department) {
		super(name,age,phoneNumber,address,salary);
		this.department=department;
	}
	
	
	public void displayDetails() {
		System.out.println("---------Manager Details------------");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Phone: "+phoneNumber);
		System.out.println("Address: "+address);
		System.out.println("Department: "+department);
		printSalary();
		System.out.println();
	}
	
	
}