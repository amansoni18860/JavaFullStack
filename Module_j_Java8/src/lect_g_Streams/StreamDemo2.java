package lect_g_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {

	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<>();

		arr.add("Sunny Deol");
		arr.add("Dharmendra");
		arr.add("Varun");
		arr.add("Satrugan");

		System.out.println(arr);

		long count = arr.stream().filter(s -> s.length() >= 10).count();

		System.out.println("The number of Strings whose length >=10 : " + count);

		ArrayList<Integer> i = new ArrayList<>();

		i.add(1);
		i.add(10);
		i.add(20);
		i.add(15);
		i.add(25);

		System.out.println(i);

		List<Integer> i1 = i.stream().sorted().collect(Collectors.toList());

		System.out.println("List According to Default Natural Sorting Order : " + i1);

		List<Integer> i2 = i.stream().sorted((a, b) -> -a.compareTo(b)).collect(Collectors.toList());

		System.out.println("List According to Customizing Sorting Order : " + i2);

		Integer min = i1.stream().min((a, b) -> a.compareTo(b)).get();

		Integer max = i1.stream().max((a, b) -> a.compareTo(b)).get();

		System.out.println("min and max value are : " + min + " " + max);
		
		
		
		ArrayList<String>arr2=new ArrayList<>();
		arr2.add("A");
		arr2.add("BB");
		arr2.add("CCC");
		
		arr2.stream().forEach(s->System.out.println(s));
		
		System.out.println();
		
		arr2.stream().forEach(System.out::println);

	}
}
