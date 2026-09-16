package lect_b_InterfaceFeatures;

interface Inter {
	default void m1() {
		System.out.println("Default Method");
	}
}

public class DefaultMethodInInterface implements Inter {

	public void m1() {
		System.out.println("Override M1 method");
	}

	public static void main(String[] args) {

		DefaultMethodInInterface d = new DefaultMethodInInterface();
		d.m1();

	}
}
