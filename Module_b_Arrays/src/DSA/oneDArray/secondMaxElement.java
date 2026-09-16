package DSA.oneDArray;

import java.util.Scanner;

public class secondMaxElement {
	
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
		
		int max=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max2 && arr[i]!=max) {
				max2=arr[i];
			}
		}
		
		System.out.println("\nSecond Maximum element in Array is : "+max2);
	}

}
