package OneDArray;

public class Array1D {

	public static void main(String[] args) {

		// array initialization
		
		int []marks= {2,4,5,3,7};
		
		System.out.println(marks.length);
		
		
		for(int i:marks) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		double [] no=new double[10];
		
		for(int i=0;i<no.length;i++) {
			no[i]=Math.random()*100;
		}
		
		
		for(double d:no) {
			System.out.print(d+" ");
		}
		System.out.println();
		
		
		String []names= {"raj","rajesh","amar","sohan"};
		System.out.println(names);
		
		for(String name:names) {
			System.out.print(name+" ");
		}
		System.out.println();
	}

}
