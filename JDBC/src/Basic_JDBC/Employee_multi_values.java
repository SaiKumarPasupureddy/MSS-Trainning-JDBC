package Basic_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class Employee_multi_values {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
		try {
			System.out.println("enter id name pno :");
			String b=sc.nextLine();
			String e=sc.nextLine();
			int a=sc.nextInt();
			long d=sc.nextLong();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/MSS","root","M1racle@123");
			PreparedStatement p=c.prepareStatement("insert into employee values(?,?,?,?)");
			p.setInt(1, a);
			p.setString(2,b);
			p.setLong(3, d);
			p.setString(4, e);
			p.executeUpdate();
			}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("done");
		}
	}
}
