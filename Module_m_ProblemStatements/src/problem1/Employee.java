package problem1;

public class Employee {

	private int id;
	private String name;
	private float salary;
	private String deptName;
	private static String organization;

	public Employee(int id, String name, float salary, String dept, String org) {

		this.id = id;
		this.name = name;
		this.salary = salary;
		this.deptName = dept;
		this.organization = org;
	}


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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public static String getOrganization() {
		return organization;
	}

	public static void setOrganization(String organization) {
		Employee.organization = organization;
	}

	@Override
	public String toString() {
        return String.format("%-5d %-10s %-10s %-10.2f %-10s", id, name, deptName, salary, organization);	
        
	}
}
