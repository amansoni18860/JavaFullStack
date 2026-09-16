package Set;

import java.util.*;

class MyComp implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s2.compareTo(s1);
	}
}

public class TreeSetDemo {

	public static void main(String[] args) {

		Set<String> h = new TreeSet(); // natural sorted
		h.add("ABC");
		h.add("Bbc");
		h.add("aaa");
		h.add("Cat");
		h.add("ccc");
		h.add("bbb");

		System.out.println(h);

		Iterator itr = h.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		
		Set<String> h2 = new TreeSet(new MyComp()); // natural sorted
		h2.add("ABC");
		h2.add("Bbc");
		h2.add("aaa");
		h2.add("Cat");
		h2.add("ccc");
		h2.add("bbb");

		System.out.println(h2);
		System.out.println();

		Iterator itr2 = h2.iterator();

		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
