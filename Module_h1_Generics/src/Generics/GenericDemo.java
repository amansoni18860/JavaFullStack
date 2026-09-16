package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
	
	public static void main(String[]args) {
		
		List list=new ArrayList();
		list.add("hello");
		
		String s=(String) list.get(0); // typecasting
		
		// After generics, no need to typecast
		
		List<String> list2=new ArrayList<>();
		list2.add("Hello");
		
		// list2.add(124) // compile time error
		
		String s2=list2.get(0);
		
		
		
	}

}
