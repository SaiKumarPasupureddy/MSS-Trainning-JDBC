package Basic_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class resultset_emp {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/MSS","root","M1racle@123");
			PreparedStatement p=c.prepareStatement("select * from employee");
			ResultSet rs=p.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getLong(3)+" "+rs.getString(4));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
