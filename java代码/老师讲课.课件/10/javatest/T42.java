

		import java.io.*;
		import java.util.*;
		class T42{

public static void main(String [] args){

	banpanzi("货架1","货架2","货架3",3);

	
	

}

		//汉诺塔递归
	public static void banpanzi(String A,String B ,String C,int n){


			//先定出口

			if(n==2){

				System.out.println(A+"====>"+B);

				System.out.println(A+"====>"+C);

				System.out.println(B+"====>"+C);
		
				return;

			}

		
			banpanzi(A,C,B,n-1);
			System.out.println(A+"===>"+C);
	
			banpanzi(B,A,C,n-1);
						





		}


		

		
		

}
