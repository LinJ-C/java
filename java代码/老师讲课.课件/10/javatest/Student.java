		class Student{




		{

			System.out.println("�����2....");

		}



		{


			System.out.println("�����1....");


		}

		static{


			System.out.println("��̬�����1....");

		}

		 Student(String id,String name,int age){

				this.id =  id ;

				this.name = name;
				this.age =  age;

				
			System.out.println("����1....");


		}

		Student (String id,String name,int age,String country){

				this(id,name,age);
				
		
				this.country = country;


		}

			 Student(String a,int b){


				id = a;
				age = b;

				country = "����";
	
			}

			Student(){

				//������ʲô��䣬�Լ���

				
			System.out.println("�޲�gouzao ....");


			}

			
			public void sing(){

				System.out.println("��...");


			}


			public void jump(){

				System.out.println("��...");


			}



			String id;

			String name="";

			String   country = "�й�";

			int age;




		}















