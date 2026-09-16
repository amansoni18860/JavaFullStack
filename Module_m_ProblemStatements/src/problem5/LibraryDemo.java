package problem5;

public class LibraryDemo {
	
	public static void main(String[]args) {
		
		Author a1=new Author("James Gsling", "james@java.com", 'M');
		Author a2=new Author("Cathy O'Neil","cathy@datasci.com",'F');
		
		Book b1=new Book("Java Programming","B101",450.0,a1);
		Book b2=new Book("Data Science Handbook","B102",600.0,a2);
		
		Library lib=new Library("City Central Libraray");
		lib.addBook(b1);
		lib.addBook(b2);
		
		lib.displayAllBooks();
	}

}
