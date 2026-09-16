package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class lec_e_CRUD {
	public static void main(String[] args) {

		// H2 driver registration is optional in JDBC 4.0+
		// Class.forName("org.h2.Driver");

        String url ="jdbc:h2:~/java/Module_p_JDBC/db/sampledb2";
		String user = "sa";
		String password = "";

		try (
				// Create connection
				Connection con = DriverManager.getConnection(url, user, password);

				// Create Statement
				Statement st = con.createStatement();

		) {
			if (con != null) {
				System.out.println("Connection is established!");
			}

			// Create Table
			String cq = "create table student(" + "sid int primary key, " + "sname varchar(20), " + "cgpa float)";

			int x = st.executeUpdate(cq); // return 0 if success

			if (x >= 0) {
				System.out.println("Student Table is Created Successfully!");
			} else {
				System.out.println("Table is not create due to some Technical Issue!");
			}

			// CRUD Operations

			// insert query
			String iq = "insert into student values " + "(101, 'Aman', 8.5)," + "(102, 'Rahul', 7.8),"
					+ "(103, 'Priya', 9.2)";

			int rows = st.executeUpdate(iq);

			if (rows > 0) {
			System.out.println("Record inserted successfully!");
			} else {
			System.out.println("Record not inserted!");
			}
			
			
			// update query
			String uq="update student set sname='Raman' where sid=101";
			int y=st.executeUpdate(uq);
			if(y>=0) {
			System.out.println("Record updated successfully!");
			} else {
			System.out.println("Record not updated!");
			}
			
			
			// delete query
			String dq="delete from student where cgpa>=9";
			int z=st.executeUpdate(dq);
			if(z>=0) {
				System.out.println("Record deleted successfully!");
				} else {
				System.out.println("Record not deleted!");
				}
			
			// Read Query
			
			ResultSet rs=st.executeQuery("select*from student");
			System.out.println("Student Details : ");
			
			while(rs.next()) {
				System.out.println(rs.getInt("sid")+" "+rs.getString("sname")+" "+rs.getDouble("cgpa"));
			}
			
			// Close connection
			con.close();

		} catch (SQLException e) {
			System.out.println("Connection failed!");
			e.printStackTrace();
		}
	}
}
