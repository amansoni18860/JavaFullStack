package lect_a_Threading;

public class MultiThreading  extends Thread{

	public void run() {
		for(int i=1;i<=10;i++) {
		System.out.println("I am in User Thread");
		}
	}
	
	
	public static void main(String[] args) {
		MultiThreading t1=new MultiThreading();
		t1.start();	
		
		for(int i=1;i<=10;i++) {
			System.out.println("I am in Main Thread");
		}
	}

}
