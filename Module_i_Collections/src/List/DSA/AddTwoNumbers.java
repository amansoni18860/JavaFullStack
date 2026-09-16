package List.DSA;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class AddTwoNumbers {

	public static void FillingVector(Vector<Integer> vc, Scanner sc) {
		System.out.println("\nEnter the size of vector : ");
		int size = sc.nextInt();

		System.out.print("\nEnter the elements in vector : ");

		for (int i = 0; i < size; i++) {
			vc.add(sc.nextInt());
		}

	}

	public static void display(Vector<Integer> vec) {
		System.out.println("The elements in Vector are  : ");

		for (int i : vec) {
			System.out.print(i + " ");

		}
		System.out.println();
	}

	
	
	public static Vector<Integer> addTwo(Vector<Integer> vec,Vector<Integer> vec2) {
	    Vector<Integer> ans = new Vector<>();
	    int carry=0;
	    
	    int a=vec.size()-1;
	    int b=vec2.size()-1;
	    
	    Collections.reverse(vec);
	    Collections.reverse(vec2);
	    
	    int s=0,sum=0;
	    
	    while(s <= a && s <= b)
	   {
		   
		   sum=vec.get(s)+vec2.get(s)+carry;
		   if(sum>9) {
			  ans.add(sum%10);
			  carry=sum/10;
		   }else {
			   ans.add(sum);
			   carry=0;
		   }
		   s++;
	   }
	   while(s<=a) {
		  sum=vec.get(s)+carry;
		  if(sum>9) {
			  ans.add(sum%10);
			  carry=sum/10;
		  }else {
			  ans.add(sum);
			   carry=0;
		  }
		  s++;
		   
	   }
	   while(s<=b) {
			  sum=vec2.get(s)+carry;
			  if(sum>9) {
				  ans.add(sum%10);
				  carry=sum/10;
			  }else {
				  ans.add(sum);
				   carry=0;
			  }
			  s++;
			   
		   }
	   
	   
	   if(carry > 0)
	   {
	       ans.add(carry);
	   }

	    Collections.reverse(ans);
	    return ans;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Vector<Integer> vec = new Vector<Integer>();  // 123
		Vector<Integer> vec2 = new Vector<Integer>();  // 1234

		FillingVector(vec, sc);

		display(vec);
		
		System.out.println("The Second Vector : ");
		
		FillingVector(vec2, sc);

		display(vec2);

		System.out.println("Result after adding 1 : "+addTwo(vec,vec2));
	}

}
