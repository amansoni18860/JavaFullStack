package lect_a_FunctionalInterface_And_LambdaFun;

interface Interf2 {
	public void m1();
}

public class AnnonymsInnerClassWithLambda {

	int x = 888;
	int C = 76;

	public void m2() {

//		Interf2 i=new Interf2() {
//		int x=999;   // instance variable
//		public void m1() {
//			System.out.println(this.x);  // 999
//		}
//	};
//

		int A = 75;

		Interf2 i = () -> {
			int B = 55;

			int x = 999; // localvariable
			System.out.println("Value of X : " + this.x); // 888
			System.out.println("Value of A : " + A);
			System.out.println("Value of B : " + B);
			System.out.println("Value of C : " + C);

			C = 44;
			System.out.println("New Value of C : " + C);

			B = 20;

			System.out.println("New Value of B : " + B);

//			A=555;
			System.out.println("Value of Cannot be Changed it is final or effectively final");

		};

		i.m1();

	}

	public static void main(String[] args) {
		AnnonymsInnerClassWithLambda T2 = new AnnonymsInnerClassWithLambda();

		T2.m2();
	}

}
