package lect_e_Predefined_Functional_Interface.Functions;

import java.util.function.Function;

public class FunctionChainingDemo {

	public static void main(String []args) {
		
		Function<String,String>f1=s1->s1.toUpperCase();
		Function<String,String>f2=s2->s2.substring(0,9);
		
		String str1="Mahabharat";
		String str2="Bhartiyam";
		
		
		System.out.println("Apply function f1 then f2 : "+f1.andThen(f2).apply(str1));
		System.out.println("Apply function f2 then f1 : "+f1.compose(f2).apply(str2));
		
	}
}
