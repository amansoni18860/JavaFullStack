package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(5);
		al.add("Learning");
		al.add(true);
		al.add(10);
		al.add("X");
		
		System.out.println(al);
		
		List<Integer> al2=new ArrayList();
		al2.add(1);
		al2.add(14);
		al2.add(25);
		al2.add(4);
		
		System.out.println("ArrayList 2 Before Sorting : "+al2);
		al.addAll(al2);
		
		al.remove(5);
		System.out.println(al);
		System.out.println("size of first arraylist : "+al.size());

		
		Collections.sort(al2);
		System.out.println("ArrayList2 After Sorting : "+al2);
		
		System.out.println();
		
		for(int i:al2) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Universal Cursor : ");
		System.out.println();

		Iterator<Integer> itr=al.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		System.out.println();
	}

}
