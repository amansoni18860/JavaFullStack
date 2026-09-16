package lec_h_DSA_Questions;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void checkReverse(int n) {

		// 123
		int reverse = 0;
		while (n != 0) {
			int a = n % 10;
			reverse = (reverse + a) * 10;
			n = n / 10;
		}
		reverse=reverse/10;

		System.out.println("Reverse of Number is " + reverse);
	}

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		n = sc.nextInt();

		checkReverse(n);
	}

}
