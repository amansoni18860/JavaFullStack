package DSA.oneDArray;

import java.util.Scanner;

public class FindDuplicateElement {
	
	

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
	
	public static void UsingBruteForceMethod(int[]arr) {
		
		boolean flag=false;
		int found=-1;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					flag=true;
					found=i;
					break;
				}
			}
		}
		
		
		if(flag) System.out.println("\nElement  " + arr[found]+" is duplicate and available at index : "+found);
		else {
			System.out.println("\nNo Duplicate Element in Array");
		}
	}

	
	public static void Approach2(int[]arr) {
		int sum=0,arrSum=0,n=arr.length;
		for(int i:arr) {
			sum+=i;
		}
		
		
		arrSum=n*(n-1)/2;  // take one less skip one element
		
		System.out.println("Duplicate Element is "+(sum-arrSum));
		
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size=sc.nextInt();
		int[]arr=new int[size];
		
		ArrayFilling(sc, arr, size);
		
		display(arr);
		
		UsingBruteForceMethod(arr);
		
		Approach2(arr);
	}
}
