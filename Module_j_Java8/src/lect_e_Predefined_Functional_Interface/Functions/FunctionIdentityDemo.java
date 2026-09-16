package lect_e_Predefined_Functional_Interface.Functions;

import java.util.function.Function;

// Function.identity() returns a function that simply returns its input argument unchanged.

public class FunctionIdentityDemo {

	public static void main(String[]args) {
		
		Function<String,String>f=Function.identity();
		
		String s=f.apply("Sohan Singh");
		
		System.out.println(s);
	}
}
