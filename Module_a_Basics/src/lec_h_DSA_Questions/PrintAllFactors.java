package lec_h_DSA_Questions;

import java.util.Scanner;

public class PrintAllFactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		System.out.println("Enter the Number : ");
		n = sc.nextInt();

		for (int i = 1; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				System.out.print(i+" ");
				System.out.print((n / i)+" ");
			} else {
				continue;
			}

		}
	}
}
