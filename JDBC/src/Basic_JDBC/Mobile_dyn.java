package Basic_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Mobile_dyn {
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/MSS","root","M1racle@123");
			PreparedStatement p=c.prepareStatement("select* from mobile",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.TYPE_SCROLL_SENSITIVE);
			p.execute();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}