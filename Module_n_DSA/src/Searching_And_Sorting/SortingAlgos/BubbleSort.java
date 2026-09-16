package Searching_And_Sorting.SortingAlgos;

import java.util.Scanner;

public class BubbleSort {

	public static void bubbleSort(int[] arr) {

		for (int i = 1; i <= arr.length - 1; i++) {

			int swap=0;
						
			for (int j = 0; j < arr.length - i; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swap++;
				}
			}
			
			if(swap==0)break;

			display(arr);
		}
	}

	
	public static void bubbleSortDescending(int[] arr) {

		for (int i = 1; i <= arr.length - 1; i++) {

			int swap=0;
						
			for (int j = 0; j < arr.length - i; j++) {

				if (arr[j] <arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swap++;
				}
			}
			
			if(swap==0)break;

			display(arr);
		}
	}

	public static void display(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
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

		bubbleSort(arr);
		System.out.println("\nAfter Bubble Sort Array : ");

		display(arr);
		
		
		bubbleSortDescending(arr);
		System.out.println("\nAfter Bubble Sort Descending Array : ");

		display(arr);
	}

}
