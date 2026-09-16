package miniProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitializer {

    public static void initializeDatabase() {

        try (Connection con = DBConnector.getConnection();
             Statement stmt = con.createStatement()) {

            // Create Authors table
            String createAuthorsTable = """
                    CREATE TABLE IF NOT EXISTS authors (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        name VARCHAR(255)
                    )
                    """;

            // Create Books table
            String createBooksTable = """
                    CREATE TABLE IF NOT EXISTS books (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        title VARCHAR(255),
                        author_id INT,
                        CONSTRAINT fk_author
                            FOREIGN KEY(author_id)
                            REFERENCES authors(id)
                    )
                    """;

            stmt.execute(createAuthorsTable);
            stmt.execute(createBooksTable);

            System.out.println("Tables created successfully.");

            insertSampleData(con);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void insertSampleData(Connection con) throws SQLException {

        // Clear existing records (optional)
        try (Statement stmt = con.createStatement()) {
            stmt.execute("DELETE FROM books");
            stmt.execute("DELETE FROM authors");
        }

        // Insert Authors
        String insertAuthor = "INSERT INTO authors(name) VALUES (?)";

        try (PreparedStatement ps = con.prepareStatement(insertAuthor)) {

            ps.setString(1, "Dennis R");
            ps.executeUpdate();

            ps.setString(1, "BG Swamy");
            ps.executeUpdate();

            ps.setString(1, "SS Rao");
            ps.executeUpdate();

            ps.setString(1, "Galvin");
            ps.executeUpdate();
        }

        // Insert Books
        String insertBook =
                "INSERT INTO books(title, author_id) VALUES (?, ?)";

        try (PreparedStatement ps = con.prepareStatement(insertBook)) {

            ps.setString(1, "C Programming");
            ps.setInt(2, 1);
            ps.executeUpdate();

            ps.setString(1, "Java Demystified");
            ps.setInt(2, 3);
            ps.executeUpdate();

            ps.setString(1, "Object Oriented Programming using C++");
            ps.setInt(2, 2);
            ps.executeUpdate();

            ps.setString(1, "OOP using Java");
            ps.setInt(2, 2);
            ps.executeUpdate();

            ps.setString(1, "Operating Systems");
            ps.setInt(2, 4);
            ps.executeUpdate();
        }

        System.out.println("Sample data inserted successfully.");
    }

    public static void main(String[] args) {
        initializeDatabase();
    }
}