package lec_h_DSA_Questions;

import java.util.Scanner;

public class CheckNumber4DigitOrNot {
	
	public static void checkNumber(int n) {
		
		if(n>999 && n<10000) {
			System.out.println("It is 4 digit Number.");
		}else {
			System.out.println("Not A 4 Digit Number");
		}
	}
	
	
	public static void checkNumberMethod2(int n) {
		//String str=String.valueOf(n);
		String str=Integer.toString(n);
		
		if(str.length()==4) {
			System.out.println("It is 4 digit Number.");
		}else {
			System.out.println("Not A 4 Digit Number");
		}
	}
	
	
	public static void CheckNumberMethod3(int n) {
		String str=n+"";
		
		if(str.length()==4) {
			System.out.println("It is 4 digit Number.");
		}else {
			System.out.println("Not A 4 Digit Number");
		}
	}
	
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int n=sc.nextInt();
		
		checkNumber(n);
		
		checkNumberMethod2(n);
		
		CheckNumberMethod3(n);
		
	}

}
