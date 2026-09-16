package FileHandling;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadDataFromUser {

	public static void main(String[] args) throws IOException {

		// Using Scanner

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name and age : ");
		String name = sc.next();
		int age = sc.nextInt();

		System.out.println("Name : " + name + "\nAge : " + age);

		// Using BufferedReader

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the name and age : ");

		String n = br.readLine();

		int a = Integer.parseInt(br.readLine());
		System.out.println("Name : " + n + "\nAge : " + a);

		// Console Class

		Console c = System.console();

		System.out.println("Enter name and pincode:");

		// returned null.

// This commonly happens when you run the program inside an IDE (Eclipse, IntelliJ IDEA, VS Code, NetBeans). System.console() works only when Java is executed from a real terminal/command prompt.
		String nam = c.readLine();
		int pin = Integer.parseInt(c.readLine());
		System.out.println("Name : " + nam + "\nPincode: " + pin);
	}

}
