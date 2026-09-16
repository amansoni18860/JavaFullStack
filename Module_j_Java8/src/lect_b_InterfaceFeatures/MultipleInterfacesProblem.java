package lect_b_InterfaceFeatures;

interface left {
	default void m1() {
		System.out.println("This is my left interface default method ");
	}
}

interface right {
	default void m1() {
		System.out.println("This is my right interface default method");

	}
}

public class MultipleInterfacesProblem implements left,right {

	public void m1() {
//		System.out.println("This is my custom implementation");

		left.super.m1(); // call left interface default interface
	}

	public static void main(String[] args) {
		MultipleInterfacesProblem Test = new MultipleInterfacesProblem();

		Test.m1();
	}

}
