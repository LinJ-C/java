



		class Student{


			String id;

			String name="";

			String   country = "中国";

			int age;


			 Student(String a,String b,int c){

				id = a;

				name = b;

				age = c;


			}

			 Student(String a,int b){


				id = a;
				age = b;

				country = "美国";
	
			}

			public void sing(){

				System.out.println("哼...");


			}


			public void jump(){

				System.out.println("嘣...");


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











