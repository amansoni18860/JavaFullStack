package DSA.oneDArray;

import java.util.Scanner;

public class LinearSearch {

	public static boolean isValuePresent(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				System.out.println("Value " + target + " is Present in array at Index : " + i);
				return true;
			}
		}
		System.out.println("Value " + target + " is not Present in Array");
		return false;
	}

	public static void display(int[] arr) {
		System.out.println("Elements in array are : ");

		for (int i : arr) {
			System.out.print(i + " ");
		}


	}
	
	
	public static void ArrayFilling(Scanner sc,int[] arr,int size) {
		System.out.println("Enter the elements in array : ");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		ArrayFilling(sc, arr, size);
		
		display(arr);
		
		System.out.println("\nEnter the target value : ");
		int target = sc.nextInt();

		System.out.println(isValuePresent(arr, target));
	}

}
