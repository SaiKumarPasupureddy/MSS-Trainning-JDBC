package Basic_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Mobile {

	public static void main(String[] args) throws Exception {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/MSS","root","M1racle@123");
			PreparedStatement p=c.prepareStatement("alter table mobile add rating int");
			int i=p.executeUpdate();
			System.out.println(i);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("DONE");
	}
	

}
