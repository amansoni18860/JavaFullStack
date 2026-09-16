package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class lec_i_StatementBatchDemo {

    public static void main(String[] args) {

        String url ="jdbc:h2:~/java/Module_p_JDBC/db/STUDENT_BATCH";
        String username = "sa";
        String password = "";

        String createTableSql =
                "CREATE TABLE IF NOT EXISTS STUDENT_BATCH (" +
                "ID INT PRIMARY KEY, " +
                "NAME VARCHAR(100), " +
                "MARKS INT" +
                ")";

        try (
            Connection connection = DriverManager.getConnection(
                    url, username, password
            );

            Statement statement = connection.createStatement()
        ) {
            System.out.println("Connection established.");

            // Create table before inserting records.
            statement.execute(createTableSql);

            /*
             * Disable auto-commit.
             *
             * This makes all batch statements part of one transaction.
             */
            connection.setAutoCommit(false);

            /*
             * Add SQL commands to the batch.
             *
             * These queries are only collected at this stage.
             * They are not executed yet.
             */
            statement.addBatch(
                    "INSERT INTO STUDENT_BATCH VALUES(1, 'Ravi', 80)"
            );

            statement.addBatch(
                    "INSERT INTO STUDENT_BATCH VALUES(2, 'Anita', 91)"
            );

            statement.addBatch(
                    "INSERT INTO STUDENT_BATCH VALUES(3, 'Kiran', 76)"
            );

            /*
             * Execute every SQL command added using addBatch().
             *
             * Returns an int array.
             *
             * Each array value represents the number of affected rows
             * for the matching batch command.
             */
            int[] results = statement.executeBatch();

            /*
             * Commit all batch inserts permanently.
             */
            connection.commit();

            System.out.println("Batch executed successfully.");

            /*
             * Print results.
             *
             * Usually every INSERT affects one row,
             * so each value is normally 1.
             */
            for (int i = 0; i < results.length; i++) {
                System.out.println(
                        "Query " + (i + 1)
                        + " affected rows: "
                        + results[i]
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}