

import java.sql.*;
import java.io.*;
import java.util.*;

class T146{

public static void main(String [] args)throws Exception{


		Scanner key = new Scanner(System.in);


		System.out.println("******************************************");


		System.out.println("");
		System.out.println("");
		System.out.println("");


		System.out.println("               ��ӭ����XXXXϵͳ          ");


		
		System.out.println("");
		System.out.println("");
		System.out.println("");
	

		System.out.println("******************************************");

	


		System.out.println("�������û���:");


		

		String t_username = key.nextLine();


	
		System.out.println("����������:");

		String t_password = key.nextLine(); 



String sql = "select * from t_user where username='"+t_username+"' and  password ='"+t_password+"'";




		//System.out.println(sql);
		

		

		select * from t_user  where username='aaa" and password='aaa' or 'a'='a'


		aaa' or 'a'='a




		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");


		String url = "jdbc:odbc:ss";

		String username = "sa";

		String password = "";

	Connection conn = DriverManager.getConnection(url,username,password);


		Statement stmt = conn.createStatement();


	

	ResultSet rs = stmt.executeQuery(sql);


	if(!rs.next()){


 		System.out.println("����ȷ���û�����������");


		return;

			

	}




	System.out.println("��ӭ����XXXXϵͳ");











       conn.close();

		
		
	
}


}