

		import java.io.*;
		import java.util.*;
		class YY{

public static void main(String [] args){



		Scanner  key = new Scanner(System.in);


			System.out.println("请输入你的年:");


		
			

		int  year  = key.nextInt();

			System.out.println("请输入你的月:");

		int month  = key.nextInt();


		System.out.println("请输入你的日期:");


		int  day  = key.nextInt();

		  int  sum_day = 0;


		for(int i=1;i<year;i++){

			if(((i%4==0)&&i%100!=0)||i%400==0){

				sum_day+=366;

			}

			else{

				sum_day+=365;
			}
			
				

		}

		//年的总天数

		for(int j=1;j<month;j++){


		if(j==1||j==3||j==5||j==7||j==8||j==10||j==12){  sum_day +=31;}

		else if(j==4||j==6||j==9||j==11){sum_day +=30;}


		else{

			if(((year%4==0)&&year%100!=0)||year%400==0){sum_day +=29;}

			else{sum_day +=28;}


		}


		}

		//月的总天数

		sum_day+=day;


		switch(sum_day%7){

		case 0: System.out.println("该天时星期天");break;
		case 1: System.out.println("该天时星期1");break;
		case 2: System.out.println("该天时星期2");break;
		case 3: System.out.println("该天时星期3");break;
		case 4: System.out.println("该天时星期4");break;
		case 5: System.out.println("该天时星期5");break;
		case 6: System.out.println("该天时星期6");break;


		}		







		}





		}