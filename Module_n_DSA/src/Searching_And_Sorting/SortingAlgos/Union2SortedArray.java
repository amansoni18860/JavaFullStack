package Searching_And_Sorting.SortingAlgos;

import java.util.ArrayList;
import java.util.Scanner;

public class Union2SortedArray {
	
    public static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    
    public static ArrayList<Integer> findUnion(int a[],int []b) {
    	ArrayList<Integer>arr=new ArrayList<Integer>();
    	
    	return arr;
    }
    
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the size of first array : ");
	        int size = sc.nextInt();

	        int[] arr = new int[size];

	        System.out.println("Enter the elements in first Array : ");
	        for (int i = 0; i < size; i++) {
	            arr[i] = sc.nextInt();
	        }
	        
	        System.out.println("Enter the size of second array : ");
	        int size2 = sc.nextInt();

	        int[] arr2 = new int[size2];

	        System.out.println("Enter the elements in second Array : ");
	        for (int i = 0; i < size2; i++) {
	            arr2[i] = sc.nextInt();
	        }

	        System.out.println("\nElements in first array are : ");
	        display(arr);
	        
	        System.out.println("\nElements in second array are : ");
	        display(arr2);
	        
	        
	        
	        
	 }
}
