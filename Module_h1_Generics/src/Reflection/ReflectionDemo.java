package Reflection;

import java.lang.reflect.*;
import java.util.*;

public class ReflectionDemo {

	public static void main(String[]args) {
		
		int mcount=0;
		int fcount=0;
		
//		Object obj=new String("Welcome to Java");
		
		List l1=new ArrayList();
		
		Class c=l1.getClass(); // Entry point for reflection
		System.out.println("FQN of class : "+c.getName());
		
		Method[] m=c.getDeclaredMethods(); // reflection
		Field[]f=c.getDeclaredFields(); // reflection
		
		for(Method m1:m) {
			mcount++;
			
			System.out.println(m1.getName());	
			
			Class<?>parameterType[]=m1.getParameterTypes();
			for(int i=0;i<parameterType.length;i++) {
				System.out.println("Parameter : "+(i+1)+" parameter type : "+parameterType[i].getName());
			}
		}
		System.out.println("No of Methods : "+mcount);
		
		System.out.println();
		
		for(Field f1:f) {
			fcount++;
			System.out.println(f1.getName());
		}
		System.out.println("No. of Fields : "+fcount);
	}
}
