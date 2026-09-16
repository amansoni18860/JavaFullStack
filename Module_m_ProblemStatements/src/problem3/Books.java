package problem3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

public class Books implements Serializable {
	
	private static final long serialVersionUID=1L;
	private String isbn;
	private String title;
	private String author;
	transient double price;
	
	public Books(String isbn,String title,String author,double price)
	{
		this.isbn=isbn;
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	public String toString() {
        return String.format("ISBN: %s, Title: %s, Author: %s, Price: %.2f", isbn, title, author, price);
	}
}


class BookManager{
	public static void serializeBooks(List<Books>books, String filename) {
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filename))){
			oos.writeObject(books);
			
			System.out.println("\nSerialization--------");
			System.out.println(books.size()+" Book objects serialized successfully to "+filename);
		}catch(IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());	
		}
	}
	
	
	public static void deserializeBooks(String filename) {
		
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(filename))){
			
			List<Books>books=(List<Books>)ois.readObject();
			System.out.println("Deserialization -----");
			System.out.println("Book Details from File : ");
			
			for(Books b:books) {
				System.out.println(b);
			}
		}catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }

	}
}
