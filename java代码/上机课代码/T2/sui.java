
	import java.util.*;
	
	class A1{


		public static void main(String [] args){



			Scanner  key = new Scanner(System.in);

			System.out.println("请输入你的月薪:");

			double salary = key.nextDouble();


	

			
			double tax = 0.0;



			if(salary<=3500){  tax=0.0;}


			else if(salary<=5000){    


				tax = (salary-3500)*0.03;


			   }
				

			else if(salary<=8000){ 


	 			tax = (salary-5000)*0.1+(5000-3500)*0.03; 


			  }
			
			else if(salary<=12500){



	 		tax = (salary-8000)*0.2+(8000-5000)*0.1+(5000-3500)*0.03; 



 			}

			else if(salary<=38500){  


	 		tax = (salary-12500)*0.25+(12500-8000)*0.2+(8000-5000)*0.1+(5000-3500)*0.03; 


		  }
				
		
			else if(salary<=58500){  

tax = (salary-38500)*0.3+(38500-12500)*0.25+(12500-8000)*0.2+(8000-5000)*0.1+(5000-3500)*0.03; 


			  }
		
			else if(salary<=83500){  


tax =(salary-58500)*0.35+(58500-38500)*0.3+(38500-12500)*0.25+(12500-8000)*0.2+(8000-5000)*0.1+(5000-3500)*0.03; 



			 }

			else{ 


		tax =(salary-83500)*0.45+(83500-58500)*0.35+(58500-38500)*0.3+(38500-12500)*0.25+(12500-8000)*0.2+(8000-5000)*0.1+(5000-3500)*0.03; 


			}


			System.out.println("你本月需要纳税"+tax+"元");	


		}


	}https://www.cnblogs.com/soulsjie/p/7501097.html