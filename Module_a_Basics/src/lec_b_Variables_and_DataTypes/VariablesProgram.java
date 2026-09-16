package lec_b_Variables_and_DataTypes;

public class VariablesProgram {
    

	public static void main(String[] args) {
		
		final double PI=3.1414;
		
		System.out.println(PI);
		
		// PI=PI+2; Error Cannot be changed
		
		byte b=100;
		
		//  byte b=200; gives error cannot be converted int to byte (out of the range)
		
		//  b=b+2;  // default type is int and b is byte conversion of int to byte gives error
		System.out.println(b);
		
	
		int i=50;
		System.out.println(i);
		
		
		long l=4;
		System.out.println(l);
		
		
	   //	float f=3.1414;
		float f2=3.1414f;
		System.out.println(f2);
		
		boolean bool=true;
		System.out.println(bool);
		
		char c='a';
		System.out.println(c);
		
		
		String str="Hello";
		System.out.println(str);
		
		
		
		
	}


}
