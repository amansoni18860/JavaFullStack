package lec_h_DSA_Questions;

import java.util.Scanner;

public class APowerB {

	public static void main(String []args) {
		System.out.println("Enter Base Number : ");
		Scanner sc=new Scanner(System.in);
		
		int base=sc.nextInt();
		
		System.out.println("Enter Power : ");
		
		int power=sc.nextInt();
		int p=power;
				
		int no=1;
		while(power!=0) {
			no=no*base;
			power--;
		}
		
		System.out.printf("The %d raised to the Power %d is  %d", base,p,no);
	}
}
