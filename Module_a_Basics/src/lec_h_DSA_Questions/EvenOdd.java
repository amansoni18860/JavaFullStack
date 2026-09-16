package lec_h_DSA_Questions;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to check even or not : ");
		int n=sc.nextInt();
		
		if(n%2==0) {
			System.out.println("Given Number is Even.");
		}
		else {
			System.out.println("Given Number is Not Even");
		}
	}
}
