

import java.sql.*;
import java.io.*;

class T145{

public static void main(String [] args)throws Exception{



		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");


		String url = "jdbc:odbc:ss";

		String username = "sa";

		String password = "";

	Connection conn = DriverManager.getConnection(url,username,password);


		Statement stmt = conn.createStatement();






	


	String sql = "select name,score from stu where id<30";

	

	ResultSet rs = stmt.executeQuery(sql);


	while(rs.next()){

		String name = rs.getString(1);


		int score = rs.getInt(2);


		System.out.print(name+"\t");

		System.out.print(score);

		System.out.println();



	}


	











       conn.close();

		
		
	
}


}