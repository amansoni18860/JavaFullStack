package mypackage;

import java.util.Scanner;   // explicit import

public class PackageType {

	public static void main(String[] args) {



			java.util.Date d = new java.util.Date(); // FQN (Fully Qualified Name)

	        System.out.println("Today's current timestamp: "+ d); // d.toString()

	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter your good Name");
	        String name = in.next();

	        System.out.println("Hello Mr/Ms."+ name);

	}

}
