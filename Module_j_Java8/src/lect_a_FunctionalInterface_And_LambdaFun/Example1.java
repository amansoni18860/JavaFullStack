package lect_a_FunctionalInterface_And_LambdaFun;

interface Interf{

	public int getLength(String s);
}

public class Example1 {
	
	public static void main(String[]args) {
		
		Interf obj=s->s.length();
		System.out.println("Length of String Rajesh Upadhya is "+obj.getLength("Rajesh Upadhya"));
	}

}
