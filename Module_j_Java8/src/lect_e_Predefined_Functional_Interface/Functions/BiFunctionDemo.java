package lect_e_Predefined_Functional_Interface.Functions;

import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> bf = (a, b) -> a * b;

		System.out.println(bf.apply(10, 20));
		System.out.println(bf.apply(100, 200));
	}

}
