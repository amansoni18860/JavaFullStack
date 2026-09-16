package lec_h_DSA_Questions;

import java.util.Scanner;

public class PrimeNumbersOrNot {

	public static void checkPrime(Scanner sc) {

		boolean isPrime = true;
		System.out.println("Enter Number : ");

		int n = sc.nextInt();

		for (int i = 2; i < n; i++) {

			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (n == 1) {
			System.out.println("Neither Prime Nor Composit!");
		} else if (isPrime) {
			System.out.println("Given Number is Prime!");
		} else {
			System.out.println("Given Number is Not Prime!");
		}
	}

	
	
	public static void checkPrimeOptimised(Scanner sc) {
		 
		boolean isPrime = true;
		System.out.println("Enter Number : ");

		int n = sc.nextInt();

		for (int i = 2; i < Math.sqrt(n); i++) {

			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (n == 1) {
			System.out.println("Neither Prime Nor Composit!");
		} else if (isPrime) {
			System.out.println("Given Number is Prime!");
		} else {
			System.out.println("Given Number is Not Prime!");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		checkPrime(sc);
		
		checkPrimeOptimised(sc);

	}
}
