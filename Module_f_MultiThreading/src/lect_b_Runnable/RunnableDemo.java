package lect_b_Runnable;

public class RunnableDemo implements Runnable {

	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
	
	
	public static void main(String[]args) {
		RunnableDemo r1=new RunnableDemo();
		RunnableDemo r2=new RunnableDemo();
		
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();
		
		// t1.run()   // normal method no multithreading
	}
}
