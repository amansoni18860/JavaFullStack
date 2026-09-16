package OneDArray;

import java.util.Arrays;
import java.util.Scanner;

public class NextProgram {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int[]arr=new int[5];
		
		int sum=0;
		
		System.out.println("Enter "+arr.length+" elements");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		System.out.println("Sum of arr elements : "+sum);
		System.out.println("Average of arr elements : "+(sum/arr.length));
		
		
		
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) min=arr[i];
			
			if(arr[i]>max) max=arr[i];
		}
		
		System.out.println("Min: "+min+"   "+"Max: "+max);

		
		 System.out.println("Please enter the element to search");
	     int x = sc.nextInt();
	     boolean flag = false;
	     for(int i=0; i<arr.length; i++){
	     if(x==arr[i]){
	     	System.out.println(x+" is found at index: "+ i);
	     	flag = true; // it helps to determine if element is not found
	     	break;
	     }
		}
		if(flag == false)
			System.out.println(x+" is  not found");
		
		System.out.println("Sorted Array");

		Arrays.sort(arr); 
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		
				
	}

}
