package lec_j_interface;

interface Printable{
	void print();
}

interface Showable{
	void show();
}


public class MultipleInheritence implements Printable,Showable {

	public void print() {
		System.out.println("Its Printing....");
	}
	
	
	public void show() {
		System.out.println("Its showing....");
	}
	
	public static void main(String[] args) {

		MultipleInheritence mi=new MultipleInheritence();
		mi.print();
		mi.print();
		
	}

}
