package lect_e_Predefined_Functional_Interface.Predicates;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String []args) {
		
		BiPredicate<Integer,Integer>pred=(a,b)->(a+b)%2==0;
		System.out.println(pred.test(10,20));
		System.out.println(pred.test(15,10));
	}
}
