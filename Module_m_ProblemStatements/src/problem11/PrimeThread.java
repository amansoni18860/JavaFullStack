package problem11;

import java.util.ArrayList;
import java.util.List;

class PrimeThread  extends Thread{
	
	List<Integer>primes=new ArrayList<>();
	
	public void run() {
		for(int i=2;i<=1000;i++) {
			if(isPrime(i)) {
				primes.add(i);
			}
		}
		System.out.println("Prime numbers between 1 and 1000:");
		System.out.println(primes);
	}
	
	private boolean isPrime(int n) {
		if(n<2)return false;
		
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0)return false;
		}
		return true;
	}

}
