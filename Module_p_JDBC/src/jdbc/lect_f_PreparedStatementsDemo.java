package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class lect_f_PreparedStatementsDemo {
	public static void main(String[] args) {

		// H2 driver registration is optional in JDBC 4.0+
		// Class.forName("org.h2.Driver");

        String url ="jdbc:h2:~/java/Module_p_JDBC/db/sampledb2";
		String user = "sa";
		String password = "";

		try (
				// Create connection
				Connection con = DriverManager.getConnection(url, user, password);

				
		) {
			if (con != null) {
				System.out.println("Connection is established!");
			}

			String q1="insert into student values (?,?,?)";
            PreparedStatement pst=con.prepareStatement(q1);
            
            pst.setInt(1, 105);
            pst.setString(2, "Dhruv");
            pst.setDouble(3, 9.5);
            int x=pst.executeUpdate();
            
            if(x>0) {
            	System.out.println(x+" record(s) inserted");
            }
            
            PreparedStatement pst2=con.prepareStatement("update student set sname=? where sid=?");
            pst2.setString(1, "Sohan");
            pst2.setInt(2, 105);

            int y=pst2.executeUpdate();
            if(y>=0) System.out.println(y+" record(s) updated");
			// Close connection
			con.close();

		} catch (SQLException e) {
			System.out.println("Connection failed!");
			e.printStackTrace();
		}
	}
}
