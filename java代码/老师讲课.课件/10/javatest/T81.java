



		class Student{


			String id;

			String name="";

			String   country = "�й�";

			int age;


			 Student(String a,String b,int c){

				id = a;

				name = b;

				age = c;


			}

			 Student(String a,int b){


				id = a;
				age = b;

				country = "����";
	
			}

			public void sing(){

				System.out.println("��...");


			}


			public void jump(){

				System.out.println("��...");


			}


		}






   class T81{



		public static void main(String [] args){



	

	Student  lisi  = new Student("134",20);


			lisi.sing();

			lisi.jump();


			System.out.println(lisi.id);
			System.out.println(lisi.country);

		


		}

}











