package lec_g_Inheritance;

// Parent Class
class Employee1 {

	int eid = 100;

	Employee1() {
		System.out.println("Employee Constructor Called");
	}

	void display() {
		System.out.println("Employee Display Method");
	}
}

// Child Class
class TechEmp1 extends Employee1 {

	int eid = 200;

	TechEmp1() {
		super(); // Calls parent constructor
		System.out.println("TechEmp Constructor Called");
	}

	@Override
	void display() {
		System.out.println("TechEmp Display Method");
	}

	void show() {

		// Access parent variable
		System.out.println("Parent eid : " + super.eid);

		// Access child variable
		System.out.println("Child eid  : " + this.eid);

		System.out.println();

		// Call parent method
		super.display();

		// Call child method
		this.display();
	}
}

public class SuperKeyword {

	public static void main(String[] args) {

		TechEmp1 te = new TechEmp1();

		System.out.println("\n---- Super Keyword Demo ----");
		te.show();
	}
}