

		import java.io.*;
		import java.util.*;
		class T43{

public static void main(String [] args){

	int x = fx(32);

	System.out.println(x);

	
	

}

		//n��쳲�����e��===>��������

	public static int  fx(int n){


			int x=0;

			//�ȶ�����

			if(n==2||n==1){
				x=1;

				return x;
			}

	
			x = fx(n-1)+fx(n-2);			

			return x;



		}


		

		
		

}
