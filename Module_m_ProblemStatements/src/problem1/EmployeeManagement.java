package problem1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeManagement {

	public static void PopulateEmployee(ArrayList<Employee> arr) {

		arr.add(new Employee(1, "Rajesh", 2000, "HR", "ABC Technologies"));
		arr.add(new Employee(2, "John", 1550.23f, "Accounts", "ABC Technologies"));
		arr.add(new Employee(3, "Gautam", 2000.250f, "Finanace", "ABC Technologies"));
		arr.add(new Employee(4, "Firoz", 5000, "HR", "ABC Technologies"));
		arr.add(new Employee(5, "Dharmendra", 8000, "IT", "ABC Technologies"));
		arr.add(new Employee(6, "Balvinder", 4500, "IT", "ABC Technologies"));
		arr.add(new Employee(7, "Amar", 3000.400f, "HR", "ABC Technologies"));
		arr.add(new Employee(8, "Sonia", 5500, "Finance", "ABC Technologies"));
		arr.add(new Employee(9, "Raj", 9000, "Accounts", "ABC Technologies"));
		arr.add(new Employee(10,"Sohan", 7500, "HR", "ABC Technologies"));

		System.out.println("Employees Fetched Successfully!\n");
	}

	public static void display(ArrayList<Employee> arr) {

		System.out.println("All Employees Details : ");

		System.out.println("ID\tName\tSalary\tDepartment\tOrganisation");
		for (Employee emp : arr) {
//			System.out.printf("%d\t%s\t%.2f\t%s\t%s\n",emp.getId(),emp.getName(),emp.getSalary(),emp.getDeptName(),emp.getOrganization());
			System.out.println(emp);
		}
	}

	public static void calculateAverage(ArrayList<Employee> arr) {

		Map<String,Double>avgSalary=arr.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.averagingDouble(Employee::getSalary)));
		avgSalary.forEach((dept,avg)->System.out.println(dept+" : "+avg));
		
	}

	public static void sortEmployee(ArrayList<Employee> arr) {
     
		arr.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
	}

	public static void top3HighestPaid(ArrayList<Employee> arr) {
      arr.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3).forEach(System.out::println);;
	}

	public static void employeeEarning(ArrayList<Employee> arr) {

		Map<String,List<Employee>>deptGroups=arr.stream().collect(Collectors.groupingBy(Employee::getDeptName));
		
	deptGroups.forEach((dept,empList)->{
		System.out.println(dept+" : ");
		empList.stream().filter(e->e.getSalary()>=5000).forEach(e->System.out.println(e.getName()+" - "+e.getSalary()));
	});
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("\nApplication Starting ....\nLoading Employee Data....");
		ArrayList<Employee> arr = new ArrayList();
		PopulateEmployee(arr);
		display(arr);
		int choice;

	do {
		
		System.out.print("\nSelect the Operation You Want to Perform : \n");
		System.out.println("1.Calculate the average salary of employees in each department.");
		System.out.println("2.Sort employees by name.");
		System.out.println("3.Find the top 3 highest-paid employees.");
		System.out.println("4.Display employees earning ≥ 5000 in each department.");
		System.out.println("5.Exit");
		
		System.out.println("Enter you choice : ");
		choice=sc.nextInt();
		
		if(choice !=5) {
			switch(choice) {
			
			case 1: calculateAverage(arr); break;
			case 2: sortEmployee(arr); break;
			case 3: top3HighestPaid(arr); break;
			case 4: employeeEarning(arr); break;
			
			default : System.out.println("Invalid Choice!"); break;
			
			}
		}
			
		
	}while(choice!=5);
		
	}
}
