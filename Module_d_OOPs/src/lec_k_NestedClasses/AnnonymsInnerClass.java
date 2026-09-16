package lec_k_NestedClasses;

abstract class Person {
	abstract void eat();

	public void speak() {
		System.out.println("English Speaking ...");
	}
}

public class AnnonymsInnerClass {

	public static void main(String[] args) {

		Person P = new Person() {
			void eat() {
				System.out.println("Eating...");
			}

			@Override
			public void speak() {
				System.out.println("Hindi Speaking");
			}
		};
		
		P.eat();
		P.speak();
	}

}
