

import java.sql.*;
import java.io.*;

class T143{

public static void main(String [] args)throws Exception{



		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");


		String url = "jdbc:odbc:ss";

		String username = "sa";

		String password = "";

	Connection conn = DriverManager.getConnection(url,username,password);


		Statement stmt = conn.createStatement();






	


	String sql = "delete from stu where id>50";




	int x = stmt.executeUpdate(sql);






		conn.close();

		
		
	
}


}