package List.DSA;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class AddingOne {

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

	public static Vector<Integer> addOne(Vector<Integer> vec) {
	    Vector<Integer> ans = new Vector<>();
	    int carry = 1;

	    for (int i = vec.size() - 1; i >= 0; i--) {
	        int sum = vec.get(i) + carry;
	        ans.add(sum % 10);
	        carry = sum / 10;
	    }

	    if (carry > 0) {
	        ans.add(carry);
	    }

	    Collections.reverse(ans);
	    return ans;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Vector<Integer> vec = new Vector<Integer>();

		FillingVector(vec, sc);

		display(vec);

		System.out.println("Result after adding 1 : "+addOne(vec));
		
	}

}
