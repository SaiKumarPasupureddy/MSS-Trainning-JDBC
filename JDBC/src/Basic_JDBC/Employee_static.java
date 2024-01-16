package Basic_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.*;

public class Employee_static {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter id name pno :");
			String b=sc.nextLine();
			int a=sc.nextInt();
			long d=sc.nextLong();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/MSS","root","M1racle@123");
			PreparedStatement p=c.prepareStatement("update employee set Id=?, Pno=? where Name=?");
			p.setInt(1, a);
			p.setLong(2, d);
			p.setString(3,b);
			p.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("done");

	}

}
