package problem9;

public class NestedTryExample {

	public static void main(String[]args) {
		System.out.println("----------Starting Program ------------\n");
	
		try {
			
			try {
				System.out.println("Inside First Nested Try Block: ");
				int num=10,num2=0;
				int result=num/num2;
				System.out.println("Division result : "+result);
			}catch(ArithmeticException e) {
				System.out.println("Error: Cannot divide by zero");
			}
			System.out.println();
			
			try {
				System.out.println("Inside Second Nested Try Block: ");
				int[]arr= {1,2,3,4,5};
				System.out.println("Accessing 10th element: "+arr[10]);
			}catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Array index out of bounds!");	
			}
		}catch(Exception e) {
            System.out.println("Outer Exception Caught: " + e.getMessage());
		}
		finally {
            System.out.println("\nOperation completed successfully.");	
		}
	}
}
