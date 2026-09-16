package Exceptions;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two numbers : ");

		int a = 0, b = 0;
		try {
			a = sc.nextInt();
			b = sc.nextInt();

			int result = a / b; // throw new java.lang.ArithmaticException();

		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();

			System.out.println(e.getMessage());

			System.err.println(e);
		}

		int sum = a + b;
		System.out.println("Sum = " + sum);

		int prod = a * b;
		System.out.println("Product = " + prod);
	}

}
