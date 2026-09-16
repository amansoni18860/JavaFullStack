package lec_h_DSA_Questions;

import java.util.Scanner;

public class IsIntegerOrNot {

	public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter Number : ");
    double n=sc.nextDouble();
    
    int x=(int)n;
    
    if(n-x>0) {
    	System.out.println("Not an Integer");
    }else {
    	System.out.println("It is an Integer.");
    }
	}

}
