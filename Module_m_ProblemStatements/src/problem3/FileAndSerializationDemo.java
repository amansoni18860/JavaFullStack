package problem3;

import java.util.ArrayList;
import java.util.List;

public class FileAndSerializationDemo {
    public static void main(String[] args) {
        String inputFile = "src/problem3/FileAndSerializationDemo.java"; // assuming same directory
        String outputFile = "output.txt";
        FileAnalyzer.analyzeFile(inputFile, outputFile, "John Doe", "12345");

        List<Books> books = new ArrayList<>();
        books.add(new Books("978-0134685991", "Effective Java", "Joshua Bloch", 750.50));
        books.add(new Books("978-0596009205", "Head First Java", "Kathy Sierra", 650.00));
        books.add(new Books("978-1617294945", "Java Concurrency in Practice", "Brian Goetz", 900.00));

        String bookFile = "books.ser";
        BookManager.serializeBooks(books, bookFile);
        BookManager.deserializeBooks(bookFile);
    }

}
