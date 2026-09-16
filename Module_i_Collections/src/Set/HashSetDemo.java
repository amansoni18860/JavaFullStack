package Set;

import java.util.*;

public class HashSetDemo {

	public static void main(String[]args) {
		Set s=new HashSet();
		
		s.add(123);
		s.add("ABC");
		s.add(9.2);
		s.add(false);
		s.add(null);
		s.add(123);
		s.add(101);
		
		
		System.out.println(s);
		
		
		Iterator itr=s.iterator();
		
		System.out.println();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
