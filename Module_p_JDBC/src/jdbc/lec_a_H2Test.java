package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class lec_a_H2Test {
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
                "jdbc:h2:~/java/Module_p_JDBC/db/testdb",
                "sa",
                "");

        System.out.println("Connected!");

        con.close();
    }
}