package Map;

import java.util.*;

public class IdentityHashMapDemo {
	
	public static void main(String[]args) {
		Map m=new IdentityHashMap();
		
		Map m2=new HashMap();
		
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		
		m.put(i1, "Raj");
		m.put(i2, "Sohan");
		
		m2.put(i1, "Raj");
		m2.put(i2, "Sohan");
		
		System.out.println(m);
		System.out.println(m2);
	}

}
