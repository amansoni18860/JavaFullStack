package lec_k_NestedClasses;

public class LocalClassDemo {

	private int data=99;
	
	public void display() {
		class Local{
			void message() {
				System.out.println("Data from outer class "+data);
			}
		}
		
		
		Local l=new Local();
		l.message();
	}
	public static void main(String[] args) {

		LocalClassDemo out=new LocalClassDemo();
		
		out.display();
	}

}
