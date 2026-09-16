package problem2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Multiple5Thread extends Thread {

	public void run() {
		Random rand=new Random();
		
		List<Integer>numbers=new ArrayList<>();
	    
		for(int i=0;i<100;i++) {
			numbers.add(rand.nextInt(500)+1);
		}
		
		System.out.println("Multiples of 5 Finder Thread");
		System.out.println("Generated 100 Random Numbers (1-500)");
		
		List<Integer>multi=numbers.stream().filter(n->n%5==0).sorted().toList();
		System.out.println("Multiples of 5 are ");
		System.out.println(multi);
	}
}
