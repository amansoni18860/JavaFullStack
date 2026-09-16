package lec_a_Class_And_Object;

class Student{
	int sid;
	String sname;
	double cgpa;
	static String school="ABC Academy";
	
	public void setStudent(int id,String name,double avg) {
		sid=id;
		sname=name;
		cgpa=avg;
	}
	
	public void getStudent() {
		System.out.println(sid+" "+sname+" "+cgpa);
	}
	
	
}

public class ClassesAndObjects {

	public static void main(String[] args) {

		Student s1 = new Student();  // creating an object
		s1.setStudent(101,"Rajesh", 9.2);
		s1.getStudent();

		
		Student s2 = new Student();  // creating an object
		s2.setStudent(102,"Rohan", 7.2);
		s2.getStudent();
	}

}
