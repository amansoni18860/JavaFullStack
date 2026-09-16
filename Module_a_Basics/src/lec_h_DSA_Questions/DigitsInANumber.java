package lec_h_DSA_Questions;

import java.util.Scanner;

public class DigitsInANumber {
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Digits : ");
		int n=sc.nextInt();
		int count=0;
		
		while(n!=0) {
			count++;
			n=n/10;
			
		}
		
		System.out.println("Number has "+count+" digits");
	}

}
