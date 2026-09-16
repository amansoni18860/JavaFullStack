package DSA.oneDArray;

import java.util.Scanner;

public class Segregate0and1 {

	public static void display(int[] arr) {
		System.out.println("\nElements in array are : ");

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	public static void ArrayFilling(Scanner sc, int[] arr, int size) {
		System.out.println("\nEnter the elements in array : ");

		// put [1 0 0 1 1 1 0 1 0  1 1 0]
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

	}

	public static void segregate(int[] arr) {

		int no0 = 0;
		int no1 = 0;

		for (int ele : arr) {
			if (ele == 0)
				no0++;
			else
				no1++;
		}

		
		int i = 0;
		while (no0 != 0 && i<arr.length) {
			arr[i] = 0;
			i++;
			no0--;
		}

		while (no1 != 0 && i<arr.length) {
			arr[i] = 1;
			i++;
			no1--;
		}
	}
	
	
	public static void segregate2(int[ ]arr) {
	
		int i=0,j=arr.length-1;
		
		while(i<=j) {
			
			if(arr[i]==0)i++;
			else if(arr[j]==1)j--;
						
			else if(arr[i]==1 && arr[j]==0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
				i++;
				j--;
				
			}
			
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		ArrayFilling(sc, arr, size);

		display(arr);
		
		segregate2(arr);
		
		
		display(arr);
	}

}
