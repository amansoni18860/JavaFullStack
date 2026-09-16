package lec_h_DSA_Questions;

import java.util.Scanner;

public class GreatestAmong3numbers {
	
	
	public static void findGreatest(int a, int b, int c) {

	    if (a == b && b == c) {
	        System.out.println("All numbers are equal.");
	    }
	    else if (a >= b && a >= c) {
	        System.out.println("A is greatest: " + a);
	    }
	    else if (b >= a && b >= c) {
	        System.out.println("B is greatest: " + b);
	    }
	    else {
	        System.out.println("C is greatest: " + c);
	    }
	}
	
	
	public static void findGreatest2(int a, int b, int c) {

	    if (a == b) {
	        if (b == c) {
	            System.out.println("All numbers are equal.");
	            return;
	        }
	    }

	    if (a >= b) {
	        if (a >= c) {
	            System.out.println("A is greatest: " + a);
	        } else {
	            System.out.println("C is greatest: " + c);
	        }
	    } else {
	        if (b >= c) {
	            System.out.println("B is greatest: " + b);
	        } else {
	            System.out.println("C is greatest: " + c);
	        }
	    }
	}
	
    public static void main(String[] args) {

        System.out.println("Enter any three numbers:");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        findGreatest(a,b,c);
        findGreatest2(a,b,c);
        

        sc.close();
    }
}