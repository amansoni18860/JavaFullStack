package lect_e_Predefined_Functional_Interface.Suppliers;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {
	
	public static void main(String[]args) {
		
		Supplier<Date>s=()->new Date();
		
		System.out.println(s.get());
		
		Supplier<String>s2=()->{
			String []s1= {"Raj","Rohan","Ronny","Sejal","Devbrat"};
			int x = (int)(Math.random() * s1.length);
			return s1[x];
	};

	System.out.println(s2.get());
	System.out.println(s2.get());
}
	
}
