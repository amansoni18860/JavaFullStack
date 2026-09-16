package lec_j_interface;

class SBI implements RBI{
	public void withdraw() {
		System.out.println("Withdraw Success!");
	}
	
	public void deposit() {
		System.out.println("Deposit Success!");
		
	}
	
	public void transfer() {
		System.out.println("Transfer Success!");
		
	}
	public void display() {
		System.out.println("I am SBI");
	}
}

public class InterfaceDemo {

	public static void main(String []args) {
		RBI r1=new SBI();
		r1.withdraw();
		r1.deposit();
		r1.transfer();
		
		SBI s=new SBI();
		s.display();
	}
	
	
}
