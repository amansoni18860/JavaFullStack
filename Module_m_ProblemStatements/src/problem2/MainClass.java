package problem2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrimeNumberThread t1=new PrimeNumberThread();
		SquareCalculatorThread t2=new SquareCalculatorThread();
		Multiple5Thread t3=new Multiple5Thread();
		
		t1.start();
		t2.start();
		t3.start();
	}

}
