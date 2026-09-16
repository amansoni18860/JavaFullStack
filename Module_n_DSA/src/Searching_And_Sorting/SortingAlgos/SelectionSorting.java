package Searching_And_Sorting.SortingAlgos;

import java.util.Scanner;

public class SelectionSorting {
	
	public static void display(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void SelectionSort(int[]arr) {
		for(int i=0;i<arr.length-1;i++) {
			int min=Integer.MAX_VALUE;
			int idx=-1;
			
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<min) {
					min=arr[j];
					idx=j;
				}
			}
			
			int temp=arr[i];
			arr[i]=arr[idx];
			arr[idx]=temp;
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter the size of array : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the elements in Array : ");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("\nElements in Array are : ");

		display(arr);

		SelectionSort(arr);
		
		System.out.println("\nAfter Selection Sort Array : ");

		display(arr);
		
		
		
	}

}
