package lect_c_MethodReference;

public class Demo3 {
	public void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {

		Demo3 t = new Demo3();

		Runnable r = t::m1;

		Thread t1 = new Thread(r);

		t1.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

	}
}
