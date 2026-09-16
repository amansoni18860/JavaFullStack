package lec_i_abstraction;

public class Bank extends AtmClass{
	
	int cashback;
	
	public Bank(double intRate,int cashback) {
		super(intRate);
		this.cashback=cashback;
	}
	
	void withdraw() {
		
		System.out.println("WithDraw Success");
		System.out.println("You get Cashback..."+cashback);
		
	}
	
	void deposit() {
		System.out.println("Deposit Success");
		System.out.println("You Got interest @"+intRate);
	}
	
	@Override
	void disp() {
		super.disp();
		System.out.println("I'm Bank");

	}
	
	void fun() {
		System.out.println("Its child specific method");
	}
	
	public static void main(String[]args) {
		AtmClass a1=new Bank(8.5,30);
		
		a1.withdraw();
		a1.deposit();
		a1.disp();
		
		Bank b1=new Bank(8.5,30);
		b1.fun();
	}

}
