package problem5;

public class Book {

	private String title;
	private String isbn;
	private double price;
	private Author author;
	
	public Book(String title,String isbn,double price,Author author) {
		this.title=title;
		this.isbn=isbn;
		this.price=price;
		this.author=author;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void displayBookInfo() {
		System.out.println("----------------------Book Details----------------");
		System.out.println("Title: "+title);
		System.out.println("ISBN: "+isbn);
		System.out.println("Price: "+price);
		author.displayAuthorInfo();
		System.out.println();

	}
}
