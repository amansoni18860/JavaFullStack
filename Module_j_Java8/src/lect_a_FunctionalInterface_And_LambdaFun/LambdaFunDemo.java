package lect_a_FunctionalInterface_And_LambdaFun;

@FunctionalInterface
interface FI {

	public void fun();

}



//
//class Demo implements FI{
//	public void m1() {
//		System.out.println("Implementation of M1 method");
//	}
//}
//
//
//public class Test{
//	public static void main(String[]args) {
//		FI obj=new Demo();
//		obj.fun();
//	}
//}

public class LambdaFunDemo {

	public static void main(String[] args) {

		FI obj=()->System.out.println("Lambda Expression");
		obj.fun();
	}

}
