

		import java.util.*;
		class T61{

public static void main(String [] args){


		String str1="adsfaksdjfkajdsf��Ϣ��������Ϣϵͳaksdfjkasjdfkajsk��Ϣ��������Ϣϵͳkasdjfjaskdfjkasef��Ϣ��������Ϣϵͳjkfajsdkfja;kdsfj��Ϣ��������Ϣϵͳ";

		String str2= "��Ϣ��������Ϣϵͳ";


		System.out.println(str1.lastIndexOf(str2));

		System.out.println(str1.length());



	
		String str5="33#33#33#33";
		
		String str6 = str5.replace("33","44");

		System.out.println(str6);
		

	       	String  []  ss = str6.split("\\.");

		System.out.println(ss.length);
		for(String s:ss){

			System.out.println(s);
		}

	StringTokenizer st = new StringTokenizer("this is, a ,test",",",true);
     		while (st.hasMoreTokens()) {
         		System.out.println(st.nextToken());
     	}


		}





}



















