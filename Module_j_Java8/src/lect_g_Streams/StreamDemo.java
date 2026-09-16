package lect_g_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	
	public static void main(String[]args) {
		
		ArrayList<Integer>arr=new ArrayList<>();
		
		arr.add(0);
		arr.add(10);
		arr.add(20);
		arr.add(5);
		arr.add(15);
		arr.add(25);
		
		
		System.out.println(arr);
		
		List<Integer> li=arr.stream()
.filter(i->i%2==0).collect(Collectors.toList());
		
		
		List<Integer>l2=li.stream().map(i->i*2).collect(Collectors.toList());
		
		System.out.println(li);
		System.out.println(l2);
		
	}

}
