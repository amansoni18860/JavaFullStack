package DSA.oneDArray;

import java.util.Scanner;

public class MissingInArray {

	
	public static void display(int[] arr) {
		System.out.println("\nElements in array are : ");

		for (int i : arr) {
			System.out.print(i + " ");
		}


	}
	
	
	public static void ArrayFilling(Scanner sc,int[] arr,int size) {
		System.out.println("\nEnter the elements in array : ");

		// put [8,2,4,5,3,7,1]
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

	}
	
	
	
	public static int missingNum(int []arr) {
		
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		int arrSum=0;
		
		for(int ele:arr) {
			arrSum+=ele;
		}
		
		// output=6
		return sum-arrSum;
	}
	
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size=sc.nextInt();
		int[]arr=new int[size];
		
		ArrayFilling(sc, arr, size);
		
		display(arr);
		
		int ans=missingNum(arr);
		System.out.println("\nMissing Number is : "+ans);
	}

}
