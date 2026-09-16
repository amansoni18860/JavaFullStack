package lect_e_Predefined_Functional_Interface.Predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateJoiningDemo {

	public static void m1(Predicate<Integer> pred, int[] x) {

		for (int x1 : x) {
			if (pred.test(x1)) {
				System.out.print(x1 + " ");
			}
		}
		System.out.println();

	}
	

	public static void main(String[] args) {

		String[] names = { "Rajesh", "Rohan", "Sohan", "Sonam" };
		Predicate<String> startswith = s -> s.charAt(0) == 'R';

		System.out.println("Name Starting with letter R in String List : ");

		for (String s : names) {
			if (startswith.test(s)) {
				System.out.println(s);
			}
		}

		String[] list = { "Nothing", null, "Apple", "" };

		Predicate<String> pred = s -> s != null && s.length() != 0;

		ArrayList<String> arr = new ArrayList<>();
		for (String s : list) {
			if (pred.test(s)) {
				arr.add(s);
			}
		}
		System.out.println("The list of valid strings : ");
		System.out.println(arr);

		int[] x = { 0, 5, 10, 15, 20, 25, 30 };

		Predicate<Integer> p1 = i -> i > 10;
		Predicate<Integer> p2 = i -> i % 2 == 0;

		System.out.println("The numbers greater than 10 are : ");
		m1(p1, x);

		System.out.println("The even numbers are : ");
		m1(p2, x);

		System.out.println("The numbers less than 10 : ");
		m1(p1.negate(), x);

		System.out.println("The numbers greater than 10 and are even : ");
		m1(p1.and(p2), x);

		System.out.println("The numbers greater 10 or even : ");
		m1(p1.or(p2), x);

	}
}
