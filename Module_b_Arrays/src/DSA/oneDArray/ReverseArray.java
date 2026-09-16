package DSA.oneDArray;

import java.util.Scanner;

public class ReverseArray {

	
	public static void display(int[] arr) {
		System.out.println("\nElements in array are : ");

		for (int i : arr) {
			System.out.print(i + " ");
		}


	}
	
	
	public static void ArrayFilling(Scanner sc,int[] arr,int size) {
		System.out.println("\nEnter the elements in array : ");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

	}
	
	public static void reverseArray(int []arr) {
		
		int s=0,e=arr.length-1;
		while(s<=e) {
			int temp=arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
			s++;
			e--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size=sc.nextInt();
		int[]arr=new int[size];
		
		ArrayFilling(sc, arr, size);
		
		display(arr);
		
		reverseArray(arr);

		display(arr);
	}

}
