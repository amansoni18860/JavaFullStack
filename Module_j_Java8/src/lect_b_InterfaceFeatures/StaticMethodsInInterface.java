package lect_b_InterfaceFeatures;

interface Inter2 {

    public static void m1() {
        System.out.println("Interface static method");
    }
}


public class StaticMethodsInInterface implements Inter2{

	  public static void main(String[] args) {

	        // m1(); // Compile-time error

	        // StaticMethodsInInterface t = new StaticMethodsInInterface();
	        // t.m1(); // Compile-time error

	        Inter2.m1(); // Correct way
	    }
	  
}
