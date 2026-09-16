package lect_e_Predefined_Functional_Interface.Predicates;

import java.util.function.Predicate;

public class PredicateEquals {
	
	public static void main(String[]args) {
		
		Predicate<String> p=Predicate.isEqual("Rajesh Singh");
		
		System.out.println(p.test("Rajesh"));
		System.out.println(p.test("rajesh singh"));
		System.out.println(p.test("Rajesh Singh"));
	}

}
