package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class lec_d_jdbcDemo {

    public static void main(String[] args) {

        // H2 driver registration is optional in JDBC 4.0+
        // Class.forName("org.h2.Driver");

        String url ="jdbc:h2:~/java/Module_p_JDBC/db/company";
        String user = "sa";
        String password = "";

        String query = "SHOW TABLES";

        try (
            // Create connection
            Connection con = DriverManager.getConnection(url, user, password);

            // Create statement
            Statement st = con.createStatement();

            // Execute query
            ResultSet rs = st.executeQuery(query)
        ) {
            if (con != null) {
                System.out.println("Connection is established!");
            }

            // Process results
            while (rs.next()) {
                // For H2 SHOW TABLES, the table name is usually in TABLE_NAME column
                String tableName = rs.getString("TABLE_NAME");
                System.out.println(tableName);
            }
            
            // Close connection
            con.close();

        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}