package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class lec_j_BatchRollbackDemo {

    public static void main(String[] args) {

        String url ="jdbc:h2:~/java/Module_p_JDBC/db/STUDENT_TRANSACTION";
        String username = "sa";
        String password = "";

        String createTableSql =
                "CREATE TABLE IF NOT EXISTS STUDENT_TRANSACTION (" +
                "ID INT PRIMARY KEY, " +
                "NAME VARCHAR(100)" +
                ")";

        try (
            Connection connection = DriverManager.getConnection(
                    url, username, password
            );

            Statement statement = connection.createStatement()
        ) {
            statement.execute(createTableSql);

            // Start manual transaction mode.
            connection.setAutoCommit(false);

            try {
                /*
                 * Add three INSERT queries.
                 *
                 * The third query has duplicate ID = 1.
                 * It is intended to fail.
                 */
                statement.addBatch(
                        "INSERT INTO STUDENT_TRANSACTION VALUES(1, 'Ravi')"
                );

                statement.addBatch(
                        "INSERT INTO STUDENT_TRANSACTION VALUES(2, 'Anita')"
                );

                statement.addBatch(
                        "INSERT INTO STUDENT_TRANSACTION VALUES(1, 'Kiran')"
                );

                /*
                 * Execute all INSERT statements.
                 *
                 * Because third statement has duplicate primary key,
                 * executeBatch() throws an SQLException.
                 */
                statement.executeBatch();

                /*
                 * This line executes only if every batch statement succeeds.
                 */
                connection.commit();

                System.out.println("Batch committed successfully.");

            } catch (SQLException e) {

                /*
                 * Cancel all batch changes because one operation failed.
                 *
                 * Records with ID 1 and ID 2 will not be saved.
                 */
                connection.rollback();

                System.out.println("Batch failed.");
                System.out.println("All batch changes rolled back.");

                e.printStackTrace();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}