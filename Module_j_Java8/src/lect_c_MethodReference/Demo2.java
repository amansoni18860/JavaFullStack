package lect_c_MethodReference;


interface Interfa{
	public void m1();
}


public class Demo2 {
	
	public static void m2() {
		System.out.println("Implementation By Method Reference");
		
	}
	
	public static void main(String[]args) {
		Interfa i=Demo2::m2;
		
		i.m1();
	}

}
