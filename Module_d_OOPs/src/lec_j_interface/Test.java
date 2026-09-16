package lec_j_interface;

public class Test implements PrintableInterface {

	public void print() {
		System.out.println("Printing....");
	}

	public void show() {
		System.out.println("Showing....");
	}

	public static void main(String[] args) {

		PrintableInterface p = new Test();
		p.print();
		p.show();
	}

}
