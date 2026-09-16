package lect_a_FunctionalInterface_And_LambdaFun;

public class Example2 {

	public static void main(String []args) {
		Runnable r=()->{
			for(int i=0;i<10;i++) {
				System.out.println("Child Thread - "+i);
			}
		};
		
		Thread t=new Thread(r);
		t.start();
		
		
		for(int i=101;i<110;i++) {
			System.out.println("Main Thread - "+i);
		}
	}
}
