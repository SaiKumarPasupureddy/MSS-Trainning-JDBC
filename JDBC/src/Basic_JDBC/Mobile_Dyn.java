package Basic_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Mobile_Dyn {

	public static void main(String[] args){
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter ");
			int a=sc.nextInt();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localHost:3306/MSS","root","M1racle@123");
		PreparedStatement p=c.prepareStatement("delete from mobile where Id=?");
		p.setInt(1,a);
		p.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("done");
	}
}
