package lect_e_Predefined_Functional_Interface.Functions;

import java.util.function.Function;

public class FunctionsDemo {

	public static void main(String[] args) {

		Function<String, Integer> f = s -> s.length();
		System.out.println("The length of the Word 'MISSIPPII' is: " + f.apply("MISSIPPII"));
		System.out.println("The length of the word 'Institute' is: " + f.apply("Institute"));

		Function<Integer, Integer> f2 = i -> i * i;

		System.out.println("Square of number 5 : " + f2.apply(5));
		System.out.println("Square of 51 : " + f2.apply(51));

		Function<String, String> f3 = s -> s.replaceAll(" ", "");
		System.out.println("The World is Awesome : " + f3.apply("The World is Awesome"));

		String str = "Rajesh Singh is Intelligent";
		Function<String, Integer> f4 = i -> i.length() - i.replaceAll(" ", "").length();
		System.out.println("Length of  Spaces in 'Rajesh Singh is Intelligent' : " + f4.apply(str));
	}
}
