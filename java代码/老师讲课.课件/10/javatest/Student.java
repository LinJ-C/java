		class Student{




		{

			System.out.println("代码块2....");

		}



		{


			System.out.println("代码块1....");


		}

		static{


			System.out.println("静态代码块1....");

		}

		 Student(String id,String name,int age){

				this.id =  id ;

				this.name = name;
				this.age =  age;

				
			System.out.println("构造1....");


		}

		Student (String id,String name,int age,String country){

				this(id,name,age);
				
		
				this.country = country;


		}

			 Student(String a,int b){


				id = a;
				age = b;

				country = "美国";
	
			}

			Student(){

				//可以是什么语句，自己定

				
			System.out.println("无参gouzao ....");


			}

			
			public void sing(){

				System.out.println("哼...");


			}


			public void jump(){

				System.out.println("嘣...");


			}



			String id;

			String name="";

			String   country = "中国";

			int age;




		}















