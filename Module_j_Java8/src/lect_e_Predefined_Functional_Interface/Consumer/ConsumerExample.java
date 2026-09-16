package lect_e_Predefined_Functional_Interface.Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

class Movie {
	String name;
	String hero;
	String heroine;

	Movie(String name, String hero, String heroine) {
		this.name = name;
		this.heroine = heroine;
		this.hero = hero;
	}

}

public class ConsumerExample {

	public static void populate(ArrayList<Movie> l) {
		l.add(new Movie("Bahubali", "Prabhas", "Anushka"));
		l.add(new Movie("Dangal", "Ameer", "Ritu"));
		l.add(new Movie("Sultan", "Salman", "Anushka"));
	}
	

	public static void main(String[] args) {

		ArrayList<Movie> movies = new ArrayList<>();

		populate(movies);

		Consumer<Movie> c = m -> {

			System.out.println("\nMovie name : " + m.name);

			System.out.println("Movie Hero : " + m.hero);

			System.out.println("Movie Heroine : " + m.heroine);
		};

		for (Movie m : movies) {
			c.accept(m);
		}
	}

}
