package Searching_And_Sorting.SortingAlgos;

import java.util.Scanner;

public class MovingAllZerosAtEnd {

	
	public static void arrayFilling(int []arr,Scanner sc) {
		System.out.println("\nEnter the elements in Array : ");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println();
	}
	
	
	public static void display(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}

		System.out.println();

	}
	
	
	public static void pushZerosToEnd(int []arr) {
		
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]==0) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

	// using two pointer approach
	
public static void pushZerosToEndOptimised(int []arr) {
		
		int n=arr.length;
		int j=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				if(i!=j) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j++;
			}
		}
		
}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of Array : ");
		int size=sc.nextInt();
		
		int []arr=new int[size];
		
		arrayFilling(arr, sc);
		
		System.out.println("Before Moving Zeros : ");
		display(arr);
		
//		pushZerosToEnd(arr);
		
		pushZerosToEndOptimised(arr);
		
		System.out.println("After Moving Zeroes At End : ");
		display(arr);
		
		
	}

}
