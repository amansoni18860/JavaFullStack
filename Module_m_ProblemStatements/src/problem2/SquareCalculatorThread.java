package problem2;

import java.util.Random;

public class SquareCalculatorThread extends Thread {

	public void run() {
		Random rand=new Random();
		
		int limit=rand.nextInt(99-11+1)+11;
		System.out.println("Square Calculator Thread : ");
		System.out.println("Random Number : "+limit);
		System.out.println("Squares from 1 to "+limit+" : ");
		for(int i=1;i<=limit;i++) {
			System.out.print((i*i)+" ");
		}
        System.out.println();
	}
}
