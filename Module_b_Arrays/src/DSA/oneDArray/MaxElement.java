package DSA.oneDArray;

public class MaxElement {

	public static void main(String[] args) {

		int []arr= {2,4,5,3,7};
		
		int max=Integer.MIN_VALUE;
		
		for(int i:arr) {
			if(max<i) {
				max=i;
			}
		}
		System.out.println("Maximum Element in array : "+max);
	}

}
