package Basic_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class resultset_03 {
	public static void main(String[] args) {
		for(int j=1;j<=3;j++) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		int c1=sc.nextInt();
		int d=sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/MSS","root","M1racle@123");
			PreparedStatement p=c.prepareStatement("insert into alcholo value(?,?,?,?)");
			p.setInt(1, c1);
			p.setString(2, a);
			p.setString(3, b);
			p.setInt(4, d);
			int i=p.executeUpdate();
			System.out.println(i);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
		System.out.println("done");
	}
	//create table mobile (brands varchar(25),series varchar(25),price double)
	//insert into mobile values("Oneplus","CE2",35000);
	

}
