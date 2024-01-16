package Basic_JDBC;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Employee_multi_ {
	public static void main(String[] args) {
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/MSS","root","M1racle@123");
	PreparedStatement ps=c.prepareStatement("select * from employee" ,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
	ResultSet rs = ps.executeQuery();  
	while(rs.next()) {
	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getLong(3)+"  "+rs.getString(4));
	}
	System.out.println("\n\n");
	while(rs.previous()) {
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getLong(3)+"  "+rs.getString(4));
	}

	      c.close();
	} catch (SQLException | ClassNotFoundException e) {
	e.printStackTrace();
	}
	}
	}