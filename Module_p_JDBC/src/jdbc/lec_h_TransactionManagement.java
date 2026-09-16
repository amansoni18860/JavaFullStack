package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class lec_h_TransactionManagement {

    public static void main(String[] args) {

        // H2 database connection details
        String url ="jdbc:h2:~/java/Module_p_JDBC/db/STUD1";
        String username = "sa";
        String password = "";

        // Create table if it does not exist
        String createTableSql =
                "CREATE TABLE IF NOT EXISTS STUD1 (" +
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

            // Create table
            statement.execute(createTableSql);

            /*
             * By default, auto-commit is true.
             *
             * Set it to false to start manual transaction handling.
             *
             * Now INSERT, UPDATE, DELETE operations are NOT saved
             * until connection.commit() is called.
             */
            connection.setAutoCommit(false);

            try {
                /*
                 * Insert first record.
                 * This is not yet permanently saved.
                 */
                statement.executeUpdate(
                        "INSERT INTO STUD1 VALUES(101, 'Ravi', 85)"
                );

                /*
                 * Insert second record.
                 * This is also not yet permanently saved.
                 */
                statement.executeUpdate(
                        "INSERT INTO STUD1 VALUES(102, 'Anita', 90)"
                );

                /*
                 * Save all successful changes permanently.
                 */
                connection.commit();

                System.out.println("Transaction committed successfully.");

            } catch (SQLException e) {

                /*
                 * If any query fails, cancel all changes made
                 * after setAutoCommit(false).
                 */
                connection.rollback();

                System.out.println("Transaction failed.");
                System.out.println("All changes rolled back.");

                e.printStackTrace();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}