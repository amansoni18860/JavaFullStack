package Generics;

class MyGen<T> {
	T obj;

	void add(T obj) {
		this.obj = obj;

	}

	T get() {
		return obj;
	}
}


public class CustomGenericDemo {
	public static void main(String[] args) {
		MyGen<Integer> m = new MyGen<Integer>();
		m.add(2);

		// m.add("ABC") // compile Time error

		System.out.println(m.get());
	}
}
