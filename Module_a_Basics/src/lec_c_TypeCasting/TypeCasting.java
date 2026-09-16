package lec_c_TypeCasting;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// implicit type casting or widening
		
		int a=5;
		long l=50;
		
		l=a;  // chote container se bade container me jana no error
		
		
		int i = 10;
		long l1 = i;      // implicit widening

		float f = i;     // implicit widening
		double d = f;    // implicit widening
		
		System.out.println(a);
		
		
		// explicit type casting or narrowing
		
		float f2=(int)3.14;
		System.out.println(f2);
		
		
		
		 byte b=(byte) 200;   // c
		 b=(byte)(b+2);

		 
		 double d2 = 3.14;
		 float f3 = (float) d; // narrowing
		 int x = 100;
		 byte b3 = (byte) x; // narrowing
	}

}
