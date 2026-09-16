package miniProject;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Author {

    private int id;
    private String name;

    // Constructors
    public Author() {
    }

    public Author(String name) {
        this.name = name;
    }

    public Author(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // =========================
    // CRUD Operations
    // =========================

    // Add Author
    public static void addAuthor(String name) {
        String sql = "INSERT INTO authors(name) VALUES(?)";

        try (Connection con = DBConnector.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.executeUpdate();

            System.out.println("Author added successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Update Author
    public static void updateAuthor(int id, String newName) {

        String sql = "UPDATE authors SET name=? WHERE id=?";

        try (Connection con = DBConnector.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, newName);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Author updated successfully.");
            } else {
                System.out.println("Author not found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete Author
    public static void deleteAuthor(int id) {

        String sql = "DELETE FROM authors WHERE id=?";

        try (Connection con = DBConnector.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Author deleted successfully.");
            } else {
                System.out.println("Author not found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // List All Authors
    public static List<Author> getAllAuthors() {

        List<Author> authors = new ArrayList<>();

        String sql = "SELECT * FROM authors";

        try (Connection con = DBConnector.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {

                Author author = new Author(
                        rs.getInt("id"),
                        rs.getString("name")
                );

                authors.add(author);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return authors;
    }

    // Display Authors
    public static void displayAuthors() {

        List<Author> authors = getAllAuthors();

        System.out.println("\n----- AUTHORS -----");

        for (Author author : authors) {
            System.out.println(
                    "ID: " + author.getId()
                    + " | Name: " + author.getName()
            );
        }
    }

    @Override
    public String toString() {
        return "Author [id=" + id + ", name=" + name + "]";
    }
}