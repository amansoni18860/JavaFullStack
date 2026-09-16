package lect_e_Predefined_Functional_Interface.Consumer;

import java.util.function.Consumer;

class Movies {
	String name;
	String result;

	Movies(String name, String result) {
		this.name = name;
		this.result = result;
	}
}

public class ConsumerChaining {

	public static void main(String[] args) {

		Consumer<Movies> c1 = m -> System.out.println("Movie : " + m.name + " is ready to released");

		Consumer<Movies> c2 = m -> System.out.println("Movie : " + m.name + " is just released and it is " + m.result);

		Consumer<Movies> c3 = m -> System.out.println("Movie : " + m.name + " information stored in DB");
		
		Consumer<Movies>chainedC=c1.andThen(c2).andThen(c3);

		Movies m1=new Movies("Bahubali","Hit");
		chainedC.accept(m1);
		
		System.out.println();
		
		Movies m2=new Movies("Spider","Flop");
		chainedC.accept(m2);

	}

}
