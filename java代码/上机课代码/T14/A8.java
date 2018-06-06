

import java.sql.*;

class A8{


public static void main(String [] aaa)  throws Exception{




		
				String driver_name = "sun.jdbc.odbc.JdbcOdbcDriver";


				Class.forName(driver_name);


				
				String url = "jdbc:odbc:student_db";

				String username="";

				String password = "";


			Connection conn =DriverManager.getConnection(url,username,password);


				Statement stmt = conn.createStatement();



			for(int i=1;i<=500;i++){

				int a  = i;

				String b = "Áõ"+i;

				String c = "ÓïÎÄ";

				int d = 66;


			
			String sql = "insert into stu(id,name,class_name,score) values("+a+",'"+b+"','"+c+"',"+d+")";

				


				int x = stmt.executeUpdate(sql);

	
			}


			conn.close();






}



}










































