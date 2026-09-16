package miniProject;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Book {

    private int id;
    private String title;
    private int authorId;

    // Constructors
    public Book() {
    }

    public Book(String title, int authorId) {
        this.title = title;
        this.authorId = authorId;
    }

    public Book(int id, String title, int authorId) {
        this.id = id;
        this.title = title;
        this.authorId = authorId;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    // Add Book
    public static void addBook(String title, int authorId) {

        String sql = "INSERT INTO books(title, author_id) VALUES(?, ?)";

        try (Connection con = DBConnector.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, title);
            ps.setInt(2, authorId);

            ps.executeUpdate();

            System.out.println("Book added successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Update Book
    public static void updateBook(int id, String title, int authorId) {

        String sql =
                "UPDATE books SET title=?, author_id=? WHERE id=?";

        try (Connection con = DBConnector.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, title);
            ps.setInt(2, authorId);
            ps.setInt(3, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Book updated successfully.");
            } else {
                System.out.println("Book not found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete Book
    public static void deleteBook(int id) {

        String sql = "DELETE FROM books WHERE id=?";

        try (Connection con = DBConnector.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Book deleted successfully.");
            } else {
                System.out.println("Book not found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Get All Books
    public static List<Book> getAllBooks() {

        List<Book> books = new ArrayList<>();

        String sql = "SELECT * FROM books";

        try (Connection con = DBConnector.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {

                books.add(
                        new Book(
                                rs.getInt("id"),
                                rs.getString("title"),
                                rs.getInt("author_id")
                        )
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return books;
    }

    // Display Books with Author Names
    public static void displayBooks() {

        String sql = """
                SELECT b.id,
                       b.title,
                       a.name
                FROM books b
                JOIN authors a
                ON b.author_id = a.id
                ORDER BY b.id
                """;

        try (Connection con = DBConnector.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("\n------ BOOKS ------");

            while (rs.next()) {

                System.out.println(
                        "ID: " + rs.getInt("id")
                        + " | Title: " + rs.getString("title")
                        + " | Author: " + rs.getString("name")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Book [id=" + id +
                ", title=" + title +
                ", authorId=" + authorId + "]";
    }
}