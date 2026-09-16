package problem2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeNumberThread extends Thread {

	public void run() {
		Random rand = new Random();
		int limit = rand.nextInt(999 - 101 + 1) + 101;
		System.out.println("Prime Number Generated Thread : ");
		System.out.println("Random Number : " + limit);

		List<Integer> primes = new ArrayList<>();

		for (int i = 2; i <= limit; i++) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}

		int sum = primes.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Prime Numbers up to " + limit + " : ");
		System.out.println(primes);

		System.out.println("Total Prime Count : " + primes.size());

		System.out.println("Sum of Primes : " + sum);
	}

	private boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
