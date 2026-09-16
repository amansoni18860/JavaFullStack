package problem11;

public class MultiThreadPrimeFibo {
	 public static void main(String[] args) {

	        PrimeThread primeThread = new PrimeThread();
	        FibonacciThread fiboThread = new FibonacciThread();

	        primeThread.start();
	        fiboThread.start();

	        try {
	            primeThread.join();
	            fiboThread.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Prefer getters if primes/fibs are private
	        CommonNumbersThread commonThread =
	                new CommonNumbersThread(primeThread.primes, fiboThread.fibs);

	        commonThread.start();
	    }
}
