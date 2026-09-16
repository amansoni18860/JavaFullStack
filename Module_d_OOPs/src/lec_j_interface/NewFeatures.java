package lec_j_interface;

interface xyz {

	void absMethod();

	default void msg() {
		System.out.println("It is Default Method");
	}

	static void fun() {
		System.out.println("Its Static Method");
	}

	private void pvtMethod() {
		System.out.println("Its a private method");
	}

	private static void stPvtMethod() {
		System.out.println("Its a static private method");
	}
}

public class NewFeatures implements xyz {

	public void absMethod() {
		System.out.println("Method of XYZ implementation in ABC");
	}

	public static void main(String[] args) {

		xyz.fun();

		NewFeatures abc = new NewFeatures();
		abc.msg();
	}

}
