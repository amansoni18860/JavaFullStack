package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Savepoint;
import java.sql.SQLException;
import java.sql.Statement;

public class lec_h_TransactionManagementTM {

    public static void main(String[] args) {

        String url ="jdbc:h2:~/java/Module_p_JDBC/db/STUD2";
        String username = "sa";
        String password = "";

        String createTableSql =
                "CREATE TABLE IF NOT EXISTS STUD2 (" +
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
            statement.execute(createTableSql);

            /*
             * Disable auto-commit.
             * We will manually decide when to save changes.
             */
            connection.setAutoCommit(false);

            try {
                /*
                 * Insert first student.
                 */
                statement.executeUpdate(
                        "INSERT INTO STUD2 VALUES(201, 'Asha', 80)"
                );

                /*
                 * Create a checkpoint after first insert.
                 *
                 * If something goes wrong after this line,
                 * we can return to this point.
                 */
                Savepoint firstStudentSaved =
                        connection.setSavepoint("FIRST_STUDENT_SAVED");

                /*
                 * Insert second student.
                 */
                statement.executeUpdate(
                        "INSERT INTO STUD2 VALUES(202, 'Rahul', 75)"
                );

                /*
                 * Insert third student.
                 */
                statement.executeUpdate(
                        "INSERT INTO STUD2 VALUES(203, 'Neha', 88)"
                );

                /*
                 * Suppose we decide to cancel only the second
                 * and third inserts.
                 *
                 * Roll back to the savepoint.
                 *
                 * Student 201 remains.
                 * Students 202 and 203 are removed.
                 */
                connection.rollback(firstStudentSaved);

                /*
                 * Permanently save what remains:
                 *
                 * Only student 201 is committed.
                 */
                connection.commit();

                System.out.println("Rollback to savepoint completed.");
                System.out.println("Only student 201 was committed.");

            } catch (SQLException e) {

                /*
                 * If a serious error occurs, undo the complete
                 * transaction.
                 */
                connection.rollback();

                System.out.println("Complete transaction rolled back.");
                e.printStackTrace();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}