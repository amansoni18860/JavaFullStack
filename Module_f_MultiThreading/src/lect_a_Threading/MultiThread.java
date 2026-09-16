package lect_a_Threading;

public class MultiThread extends Thread {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName());
			System.out.println(i);
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		MultiThread t1 = new MultiThread();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} // throws InterruptedException

		t1.setPriority(MIN_PRIORITY);

		MultiThread t2 = new MultiThread();
		t2.start();
		t2.setName("secondThread");
		t2.setPriority(NORM_PRIORITY);

		MultiThread t3 = new MultiThread();
		t3.start();
		t3.setName("thirdThread");
		t3.setPriority(MAX_PRIORITY);
	}

}
