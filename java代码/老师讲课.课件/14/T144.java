

import java.sql.*;
import java.io.*;

class T144{

public static void main(String [] args)throws Exception{



		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");


		String url = "jdbc:odbc:ss";

		String username = "sa";

		String password = "";

	Connection conn = DriverManager.getConnection(url,username,password);


		Statement stmt = conn.createStatement();






	


	String sql = "update stu set score = 90 ";




	int x = stmt.executeUpdate(sql);





       conn.close();

		
		
	
}


}