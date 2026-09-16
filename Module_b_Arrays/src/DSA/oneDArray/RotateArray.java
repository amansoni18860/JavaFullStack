package DSA.oneDArray;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {


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
	
	
//	public static void rotateArray(int[] arr, int d) {
//	    int n = arr.length;
//	    int[] temp = new int[n];
//
//	    for (int i = 0; i < n; i++) {
//	        temp[i] = arr[(i + d) % n];
//	    }
//
//	    for (int i = 0; i < n; i++) {
//	        arr[i] = temp[i];
//	    }
//	}
	
	public static void rotateArray(int[] arr, int d) {
	    int n = arr.length;
	    int[] temp = new int[n];

	    for (int i = 0; i < n; i++) {
	        temp[(i + d) % n] = arr[i];
	    }

	    System.arraycopy(temp, 0, arr, 0, n);
	}
	
	public static void rotateArr(int []arr,int d) {
	
		int n=arr.length;
		
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
	}
	
	
	public static void reverse(int arr[],int s, int e) {
		
		while(s<=e) {
			int temp=arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
			
			s++;
			e--;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size=sc.nextInt();
		int[]arr=new int[size];
		
		ArrayFilling(sc, arr, size);
		
		display(arr);
		
	    System.out.println("\nRotate Array By : ");
	    int d=sc.nextInt();
		
		rotateArr(arr, d);
		display(arr);

	    rotateArray(arr, d);
		display(arr);
	}

}
