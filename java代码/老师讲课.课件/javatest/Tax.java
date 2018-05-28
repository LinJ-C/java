

		import java.io.*;
		import java.util.*;
		class Tax{

		public static void main(String [] args){



			int x= 0;

			double tax = 0.0;


			Scanner  key = new Scanner(System.in);


			System.out.println("请输入你的收入:");

			x = key.nextInt();



			if(x<=3500){


				tax=0.0;

			}


			else if(x<=5000){


				tax = (x-3500)*0.05;

			}



			else if(x<=8000){


			tax = (x-5000)*0.1+(5000-3500)*0.05;


			}


			else if(x<=20000){


	tax = (x-8000)*0.2+(8000-5000)*0.1+(5000-3500)*0.05;

			}


			else{

	tax = (x-20000)*0.45+(20000-8000)*0.2+(8000-5000)*0.1+(5000-3500)*0.05;


		}



		System.out.println("你应该纳税"+tax);




		}





		}