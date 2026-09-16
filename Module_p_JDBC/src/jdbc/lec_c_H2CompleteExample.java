package jdbc;

import java.sql.*;

public class lec_c_H2CompleteExample {
    public static void main(String[] args) {
        String url ="jdbc:h2:~/java/Module_p_JDBC/db/company";
        String user = "sa";
        String password = "";

        String create =
            "CREATE TABLE IF NOT EXISTS EMPLOYEE (" +
            "ID INT PRIMARY KEY, " +
            "NAME VARCHAR(100), " +
            "DEPARTMENT VARCHAR(100), " +
            "SALARY DECIMAL(10,2))";

        String insert =
            "MERGE INTO EMPLOYEE (ID, NAME, DEPARTMENT, SALARY) " +
            "KEY(ID) VALUES (?, ?, ?, ?)";

        String select = "SELECT * FROM EMPLOYEE ORDER BY ID";

        try (Connection con =
                 DriverManager.getConnection(url, user, password)) {

            try (Statement st = con.createStatement()) {
                st.execute(create);
            }

            try (PreparedStatement ps = con.prepareStatement(insert)) {
                ps.setInt(1, 1);
                ps.setString(2, "Aman");
                ps.setString(3, "IT");
                ps.setBigDecimal(4,
                    new java.math.BigDecimal("50000"));
                ps.executeUpdate();
            }

            try (PreparedStatement ps = con.prepareStatement(select);
                 ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {
                    System.out.println(
                        rs.getInt("ID") + " " +
                        rs.getString("NAME") + " " +
                        rs.getString("DEPARTMENT") + " " +
                        rs.getBigDecimal("SALARY")
                    );
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
