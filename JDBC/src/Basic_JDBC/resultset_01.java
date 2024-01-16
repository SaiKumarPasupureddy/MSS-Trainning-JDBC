package Basic_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class resultset_01 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/MSS","root","M1racle@123");
			PreparedStatement p=c.prepareStatement("select * from mobile",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet r=p.executeQuery();
			ResultSetMetaData rm=r.getMetaData();
			System.out.println(rm.getTableName(4));
			for(int i=1;i<=rm.getColumnCount();i++) {
				System.out.print("("+rm.getColumnType(i)+")"+" ");
				System.out.print(rm.getColumnName(i)+" ");
			}
			//r.absolute(11);
			System.out.println();
			while(r.previous()) {
				System.out.println(r.getString(1)+" "+r.getString(2)+" "+r.getInt(3));
			}
		}
		catch( Exception e){
			System.out.println(e);
		}
	}
}