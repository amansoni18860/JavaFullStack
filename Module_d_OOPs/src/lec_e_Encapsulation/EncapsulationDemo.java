package lec_e_Encapsulation;

class Student{
	private int sid;
	private String sname;
	private double gpa;
	private static String university="IIT";
	
	public void setStudent(int id,String name,double avg) {
		sid=id;
		sname=name;
		gpa=avg;
	}
	
	public void getStudent() {
		System.out.println(sid+" "+sname+" "+gpa+" "+university);
	}
	
	void getSname() {
		System.out.println(sname);
	}
}


public class EncapsulationDemo {

	public static void main(String[] args) {

		Student s1=new Student();
		
		s1.setStudent(101, "Sohan", 9.12);
		
		s1.getStudent();
		
		s1.getSname();
	}

}
