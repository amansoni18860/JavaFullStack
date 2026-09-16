package DSA.oneDArray;

import java.util.Scanner;

public class WavvyArray {

	public static void display(int[] arr) {
		System.out.println("\nElements in array are : ");

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	public static void ArrayFilling(Scanner sc, int[] arr, int size) {
		System.out.println("\nEnter the elements in array : ");

		// put [2 4 7 8 9 10]
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

	}

	
	// give output [ 4 2 8 7 10 9]
	
	public static void convertToWave(int []arr) {
		
		for(int i=0;i<arr.length;i+=2) {
			if(i==arr.length-1)break;
			int temp=arr[i];
			arr[i]=arr[i+1];
		arr[i+1]=temp;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		ArrayFilling(sc, arr, size);

		display(arr);
		
		convertToWave(arr);
		
		display(arr);
	}

}
