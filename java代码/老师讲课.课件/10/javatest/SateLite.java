		class SateLite{





		 SateLite(String id,String name,int age){

				this.id =  id ;

				this.name = name;
				this.age =  age;

				
			System.out.println("����1....");


		}

		SateLite (String id,String name,int age,String country){

				this(id,name,age);
				
		
				this.country = country;


		}

			 SateLite(String a,int b){


				id = a;
				age = b;

				country = "����";
	
			}

			SateLite(){

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

		private	int height ;


		public void 	setHeight(int x){

			//���x�İ�ȫ��


			if(x>360&&x<600){

				height = x;

			}

			else{


				return;

			}



		}


		public int getHeight(){

			//�������ߵ�Ȩ��

			//����


			return height;



		}

		




		}















