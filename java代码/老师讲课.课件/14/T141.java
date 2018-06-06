

import java.sql.*;
import java.io.*;

class T141{

public static void main(String [] args)throws Exception{



		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");


		String url = "jdbc:odbc:ss";

		String username = "sa";

		String password = "";

	Connection conn = DriverManager.getConnection(url,username,password);


		Statement stmt = conn.createStatement();

		String sql = "insert into stu(id,name,classname,score) values(1,'уехЩ','сОнд',88)";


		int x = stmt.executeUpdate(sql);


		conn.close();

		
		
	
}


}