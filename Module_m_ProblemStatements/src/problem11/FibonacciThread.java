package problem11;

import java.util.ArrayList;
import java.util.List;

class FibonacciThread extends Thread {

	 List<Integer>fibs=new ArrayList<>();
	 
	 public void run() {
		 int a=0,b=1;
		 fibs.add(a);
		 fibs.add(b);
		 
		 while(true) {
			 int next=a+b
;
			 if(next>1000)break;
			 fibs.add(next);
			 a=b;
			 b=next;
				 
		 
		 }
		 
		 System.out.println("\nFibonacci numbers upto 1000: ");
		 System.out.println(fibs);
	 }
}
