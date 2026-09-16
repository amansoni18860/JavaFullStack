package problem6;

public class MemberDemo {
	
	public static void main(String[] args) {
		Employee emp = new Employee("John Doe", 28, "8989898989", "New Delhi", 50000.0, "Software Developement");
		Manager mgr = new Manager("Sarah Smith", 35, "8998989889", "Mumbai", 76000.0, "Human Resources");

		emp.displayDetails();
		mgr.displayDetails();
	}

}
