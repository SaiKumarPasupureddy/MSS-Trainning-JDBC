package Basic_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class resultset_04 {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/MSS","root","M1racle@123");
			PreparedStatement p=c.prepareStatement("select * from alcholo");
			ResultSet r=p.executeQuery();
			ResultSetMetaData rm=r.getMetaData();
			for(int i=1;i<=rm.getColumnCount();i++) {
				System.out.print(rm.getColumnName(i));
				System.out.print("("+rm.getColumnType(i)+")");
			}
			System.out.println();
			while(r.next()) {
				System.out.println(r.getInt(4)+" "+r.getString(2)+" "+r.getString(3)+" "+r.getInt(4));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
