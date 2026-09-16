package lect_f_PrimitiveTypeFunctionalInterface;

import java.util.function.IntPredicate;

public class IntPredicateDemo {

	public static void main(String[]args) {
		int []x= {0,5,10,15,20,25};
		
		IntPredicate p=i->i%2==0;
		
		for(int i:x) {
			if(p.test(i)) {
				System.out.print(i+" ");
			}
		}
	}
}
