package lect_e_Predefined_Functional_Interface.Predicates;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[]args) {
		
		Predicate<Integer>p=I->I>10;
		
		System.out.println(p.test(100));
		System.out.println(p.test(5));
		
		
		Predicate<String>p2=s->s.length()>5;
		System.out.println(p2.test("abcdef"));
		System.out.println(p2.test("abc"));
		
		
		Predicate<Collection>p3=c->c.isEmpty();
		ArrayList l1=new ArrayList();
		l1.add(15);
		
		System.out.println(p3.test(l1));
		
		ArrayList l2=new ArrayList();
		
		System.out.println(p3.test(l2));
		
	}
}
