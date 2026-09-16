package problem5;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private String libraryName;
	private List<Book>books;
	
	public Library(String libraryName) {
		this.books=new ArrayList<>();
	}
	
	public void addBook(Book b) {
		books.add(b);
	}
	
	public void removeBook(String isbn) {
		books.removeIf(b->b.getIsbn().equals(isbn));
	}
	
	public void displayAllBooks() {
		System.out.println("Library: "+libraryName+"\n");
		for(Book b:books) {
			b.displayBookInfo();
		}
	}
}
