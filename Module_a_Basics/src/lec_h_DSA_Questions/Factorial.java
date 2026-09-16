package lec_h_DSA_Questions;

import java.util.Scanner;

public class Factorial {

	public static void main(String[]args) {
		System.out.println("Enter any Number : ");
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int fact=1;
		while(n!=0) {
			fact=fact*(n);
			n--;
		}
		
		System.out.println(fact);
	}
}
