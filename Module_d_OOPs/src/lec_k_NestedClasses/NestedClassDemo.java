package lec_k_NestedClasses;

public class NestedClassDemo {

	private int data=99;
	
	class Inner{
		void message() {
			System.out.println("Data of outer class is : "+data);
		}
	}
	
	
	void display() {
		System.out.println("Im outer class method");
	}
	
	public static void main(String[] args) {
		
		NestedClassDemo out=new NestedClassDemo();
		
		NestedClassDemo.Inner in =out. new Inner();
		in.message();
		
		out.display();

	}

}
