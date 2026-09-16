package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class lec_k_PreparedStatementBatchDemo {

    public static void main(String[] args) {

        // Use a simple relative path
        String url = "jdbc:h2:./db/studentdb";
        String username = "sa";
        String password = "";

        String createTableSql =
                "CREATE TABLE IF NOT EXISTS STUDENT_PREPARED_BATCH ("
                + "ID INT PRIMARY KEY, "
                + "NAME VARCHAR(100), "
                + "MARKS INT"
                + ")";

        String insertSql =
                "INSERT INTO STUDENT_PREPARED_BATCH (ID, NAME, MARKS) "
                + "VALUES (?, ?, ?)";

        try (Connection connection =
                     DriverManager.getConnection(url, username, password)) {

            System.out.println("Connected to:");
            System.out.println(connection.getMetaData().getURL());

            // Create table
            try (PreparedStatement createStmt =
                         connection.prepareStatement(createTableSql)) {

                createStmt.execute();
                System.out.println("Table created/verified.");
            }

            connection.setAutoCommit(false);

            try (PreparedStatement ps =
                         connection.prepareStatement(insertSql)) {

                // Row 1
                ps.setInt(1, 1);
                ps.setString(2, "Ravi");
                ps.setInt(3, 85);
                ps.addBatch();

                // Row 2
                ps.setInt(1, 2);
                ps.setString(2, "Anita");
                ps.setInt(3, 90);
                ps.addBatch();

                // Row 3
                ps.setInt(1, 3);
                ps.setString(2, "Kiran");
                ps.setInt(3, 75);
                ps.addBatch();

                int[] result = ps.executeBatch();

                connection.commit();

                System.out.println("Batch committed successfully.");

                for (int i = 0; i < result.length; i++) {
                    System.out.println(
                            "Batch Item " + (i + 1)
                            + " -> Rows Affected: "
                            + result[i]
                    );
                }

            } catch (SQLException e) {

                connection.rollback();
                System.out.println("Batch rolled back.");

                e.printStackTrace();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}