

import java.sql.*;
import java.io.*;

class T142{

public static void main(String [] args)throws Exception{



		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");


		String url = "jdbc:odbc:ss";

		String username = "sa";

		String password = "";

	Connection conn = DriverManager.getConnection(url,username,password);


		Statement stmt = conn.createStatement();


for(int i=2;i<=500;i++){

	String classnames [] ={"����","��ѧ","Ӣ��"};

	int id = i;

	String name = "��"+i;

	String classname = classnames[(int)(Math.random()*3)];

	int score = 60+((int)(Math.random()*41));
	


	String sql = "insert into stu(id,name,classname,score) values("+id+",'"+name+"','"+classname+"',"+score+")";


	int x = stmt.executeUpdate(sql);



}


		conn.close();

		
		
	
}


}