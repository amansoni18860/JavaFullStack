package lect_g_Streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class NextExample {

	public static void main(String[]args) {
		ArrayList<Integer>arr=new ArrayList<>();
		arr.add(0);
		arr.add(25);
		arr.add(10);
		arr.add(12);
		arr.add(35);
		
		System.out.println(arr);
		
		Integer[]array=arr.stream().toArray(Integer[]::new);
		
		for(Integer x:array) System.out.println(x);
		
		System.out.println();
		
		Stream <Integer>s=Stream.of(9,99,999,9999);
		s.forEach(System.out::println);
	}
}
