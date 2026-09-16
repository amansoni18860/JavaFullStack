package TwoDArray;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int[][]arr=new int[3][4];
		
		int [][]x= {{1,2,3},{3,4,5},{5,6,7}};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(x[i][j]+" ");
				
			}
			System.out.println();
		}
		
		System.out.println("Please enter data items into array");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
	
		
		
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
