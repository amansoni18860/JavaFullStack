package miniProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    private static final String URL = "jdbc:h2:~/java/Module_p_JDBC/db/lms";
    private static final String USERNAME = "sa";
    private static final String PASSWORD = "";

    // Use this method from other classes to obtain the database connection
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    public static void main(String[] args) {
        try (Connection con = getConnection()) {

            if (con != null) {
                System.out.println("Connection is established!");
            }

        } catch (SQLException e) {
            System.out.println("Database connection failed.");
            e.printStackTrace();
        }
    }
}