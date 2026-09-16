package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class lec_g_callableStatements {

    public static void main(String[] args) {

        /*
         * Scanner is used to read values from the keyboard.
         *
         * Similar to entering values in a SQL client,
         * but here the values are entered into the Java program.
         */
        Scanner scanner = new Scanner(System.in);

        /*
         * JDBC connection details.
         *
         * H2 database URL:
         * jdbc:h2:./data/sampledb
         *
         * This creates or opens an H2 database named sampledb
         * inside the data folder.
         */
        String url ="jdbc:h2:~/java/Module_p_JDBC/db/callableDB";

        /*
         * Default H2 username is usually:
         */
        String username = "sa";

        /*
         * Default H2 password is usually empty.
         */
        String password = "";

        try {
            /*
             * Create a connection between Java and H2.
             *
             * This is similar to logging in to a database
             * using a SQL client.
             */
            Connection connection = DriverManager.getConnection(
                    url,
                    username,
                    password
            );

            System.out.println("Connection established!");

            /*
             * We need to create a function in the H2 database.
             *
             * H2 does not use the same CREATE FUNCTION syntax
             * as MySQL in this example.
             *
             * CREATE ALIAS creates a database function that calls
             * a Java method.
             *
             * The function name will be ADD_AB.
             *
             * It accepts two integer values:
             *     a
             *     b
             *
             * It returns:
             *     a + b
             */
            String createFunctionSql =
                    "CREATE ALIAS IF NOT EXISTS ADD_AB AS " +
                    "'int addAb(int a, int b) { return a + b; }'";

            /*
             * Statement is used to execute normal SQL commands.
             *
             * This is similar to running a SQL command directly
             * in a database tool.
             */
            Statement statement = connection.createStatement();

            /*
             * Create the ADD_AB function in H2.
             *
             * IF NOT EXISTS means:
             * create the function only if it does not already exist.
             */
            statement.execute(createFunctionSql);

            /*
             * This is the JDBC syntax for calling a function:
             *
             * {? = CALL ADD_AB(?, ?)}
             *
             * Explanation:
             *
             * The first ? represents the return value.
             * The second ? represents the first input value.
             * The third ? represents the second input value.
             *
             * In SQL form, the function call is conceptually:
             *
             *     ADD_AB(a, b)
             *
             * If a = 10 and b = 20:
             *
             *     ADD_AB(10, 20)
             *
             * returns:
             *
             *     30
             */
            String callFunctionSql = "{? = CALL ADD_AB(?, ?)}";

            /*
             * CallableStatement is used to call:
             *
             * 1. Stored procedures
             * 2. Stored functions
             *
             * prepareCall() prepares the function call.
             */
            CallableStatement callableStatement =
                    connection.prepareCall(callFunctionSql);

            /*
             * Ask the user for two numbers.
             */
            System.out.println("Enter the first number:");
            int a = scanner.nextInt();

            System.out.println("Enter the second number:");
            int b = scanner.nextInt();

            /*
             * Parameter positions start from 1, not 0.
             *
             * The function call is:
             *
             *     {? = CALL ADD_AB(?, ?)}
             *
             * Parameter 1:
             *     Return value
             *
             * Parameter 2:
             *     First input value, a
             *
             * Parameter 3:
             *     Second input value, b
             */

            /*
             * Tell JDBC that parameter 1 will contain
             * an integer returned by the function.
             *
             * This is required because parameter 1 is an OUT value.
             */
            callableStatement.registerOutParameter(
                    1,
                    Types.INTEGER
            );

            /*
             * Set the first input value.
             *
             * The second ? belongs to a.
             */
            callableStatement.setInt(2, a);

            /*
             * Set the second input value.
             *
             * The third ? belongs to b.
             */
            callableStatement.setInt(3, b);

            /*
             * Execute the function in the database.
             *
             * This is similar to running:
             *
             *     ADD_AB(a, b)
             *
             * in the database.
             */
            callableStatement.execute();

            /*
             * Read the returned value.
             *
             * The returned value is stored in parameter 1.
             */
            int result = callableStatement.getInt(1);

            /*
             * Display the result.
             */
            System.out.println("Sum: " + result);

            /*
             * Close the JDBC resources.
             *
             * Closing resources is important because it releases
             * database and memory resources.
             */
            callableStatement.close();
            statement.close();
            connection.close();
            scanner.close();

        } catch (SQLException e) {

            /*
             * If there is a database error, this block executes.
             */
            System.out.println("Database error occurred.");
            e.printStackTrace();
        }
    }
}