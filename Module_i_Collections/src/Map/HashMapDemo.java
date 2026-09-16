package Map;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
  
		Map<Integer,String>m=new HashMap();
		
		m.put(200, "PQR");
		m.put(101, "ABC");
		m.put(104, "ABC");
		m.put(102, "XYZ");
		m.put(101, "112");
		
		System.out.println(m);
		
		Collection c1=m.keySet();
		System.out.println(c1);
		
		Collection c2=m.values();
		System.out.println(c2);
		
		Set s=m.entrySet();
		Iterator itr=s.iterator();
		
		System.out.println();
		
		System.out.println("Key\tValue");
		while(itr.hasNext()) {
			Map.Entry me=(Map.Entry) itr.next();
			System.out.println(me.getKey()+"\t"+me.getValue());
		}
		
	}

}
