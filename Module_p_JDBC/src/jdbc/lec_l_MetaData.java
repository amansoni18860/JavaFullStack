package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class lec_l_MetaData {

    public static void main(String[] args) {

        /*
         * H2 database connection details.
         *
         * This opens the database file:
         * db/metadata.mv.db
         */
        String url = "jdbc:h2:./db/metadata";
        String username = "sa";
        String password = "";

        /*
         * Creates a STUDENT table if it does not already exist.
         */
        String createTableSql =
                "CREATE TABLE IF NOT EXISTS STUDENT (" +
                "ID INT PRIMARY KEY, " +
                "NAME VARCHAR(100), " +
                "MARKS DOUBLE" +
                ")";

        /*
         * Insert sample rows only if the table is empty.
         *
         * H2 supports MERGE. If the ID already exists,
         * it will update/keep the row instead of giving
         * a duplicate primary-key error.
         */
        String insertStudent1 =
                "MERGE INTO STUDENT (ID, NAME, MARKS) " +
                "KEY(ID) VALUES (1, 'Ravi', 85.5)";

        String insertStudent2 =
                "MERGE INTO STUDENT (ID, NAME, MARKS) " +
                "KEY(ID) VALUES (2, 'Anita', 91.0)";

        String insertStudent3 =
                "MERGE INTO STUDENT (ID, NAME, MARKS) " +
                "KEY(ID) VALUES (3, 'Kiran', 76.5)";

        try (
            /*
             * Connect Java to the H2 database.
             *
             * Class.forName("org.h2.Driver") is usually not needed
             * if h2.jar is included in the Eclipse Build Path.
             */
            Connection con = DriverManager.getConnection(
                    url,
                    username,
                    password
            );

            /*
             * Statement is used to execute normal SQL commands.
             */
            Statement st = con.createStatement()
        ) {
            System.out.println("Connection established!");

            /*
             * Create STUDENT table.
             */
            st.execute(createTableSql);

            /*
             * Add sample records.
             */
            st.executeUpdate(insertStudent1);
            st.executeUpdate(insertStudent2);
            st.executeUpdate(insertStudent3);

            // =====================================================
            //                 DATABASE METADATA
            // =====================================================

            System.out.println(
                    "\n******** DATABASE METADATA ********"
            );

            /*
             * DatabaseMetaData gives information about the database:
             *
             * - Database name
             * - Database version
             * - JDBC driver name
             * - JDBC driver version
             * - Current user
             * - Tables available in the database
             */
            DatabaseMetaData dbmd = con.getMetaData();

            System.out.println("Driver Name: "
                    + dbmd.getDriverName());

            System.out.println("Driver Version: "
                    + dbmd.getDriverVersion());

            System.out.println("Database Product Name: "
                    + dbmd.getDatabaseProductName());

            System.out.println("Database Product Version: "
                    + dbmd.getDatabaseProductVersion());

            System.out.println("User Name: "
                    + dbmd.getUserName());

            System.out.println("Connection: "
                    + dbmd.getConnection());

            /*
             * Display user tables.
             *
             * getTables(catalog, schemaPattern, tableNamePattern, types)
             *
             * null means we are not filtering by catalog/schema/name.
             *
             * {"TABLE"} means show only normal tables.
             */
            System.out.println("\nTables in H2 database:");

            String[] tableTypes = { "TABLE" };

            try (
                ResultSet rs1 = dbmd.getTables(
                        null,
                        null,
                        null,
                        tableTypes
                )
            ) {
                while (rs1.next()) {

                    /*
                     * TABLE_NAME is clearer than getString(3).
                     *
                     * Column number 3 in getTables() is TABLE_NAME.
                     */
                    System.out.println(
                            rs1.getString("TABLE_NAME")
                    );
                }
            }

            // =====================================================
            //                 RESULTSET METADATA
            // =====================================================

            System.out.println(
                    "\n******** RESULTSET METADATA ********"
            );

            /*
             * Execute SELECT query.
             */
            String selectSql =
                    "SELECT ID, NAME, MARKS FROM STUDENT";

            try (
                ResultSet rs2 = st.executeQuery(selectSql)
            ) {
                /*
                 * ResultSetMetaData gives information about
                 * the columns returned by a SELECT query.
                 *
                 * It does NOT give the row values directly.
                 * It gives column details such as:
                 *
                 * - Number of columns
                 * - Column name
                 * - Column type
                 * - Column size
                 */
                ResultSetMetaData rsmd = rs2.getMetaData();

                int columnCount = rsmd.getColumnCount();

                System.out.println(
                        "Number of columns: " + columnCount
                );

                System.out.println("\nColumn details:");

                /*
                 * JDBC column positions start at 1, not 0.
                 */
                for (int i = 1; i <= columnCount; i++) {

                    System.out.println(
                            "Column " + i
                            + " Name: " + rsmd.getColumnName(i)
                            + " | Type: " + rsmd.getColumnTypeName(i)
                            + " | Size: " + rsmd.getColumnDisplaySize(i)
                    );
                }

                System.out.println("\n******** STUDENT DATA ********");

                /*
                 * Print column names as headings.
                 */
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(
                            rsmd.getColumnName(i) + "\t"
                    );
                }

                System.out.println();

                /*
                 * rs2.next() moves the ResultSet cursor
                 * to the next record.
                 */
                while (rs2.next()) {

                    System.out.print(
                            rs2.getInt("ID") + "\t"
                    );

                    System.out.print(
                            rs2.getString("NAME") + "\t"
                    );

                    System.out.print(
                            rs2.getDouble("MARKS")
                    );

                    System.out.println();
                }
            }

        } catch (SQLException e) {
            System.out.println("Database error occurred.");
            e.printStackTrace();
        }
    }
}