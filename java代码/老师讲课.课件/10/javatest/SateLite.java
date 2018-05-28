		class SateLite{





		 SateLite(String id,String name,int age){

				this.id =  id ;

				this.name = name;
				this.age =  age;

				
			System.out.println("构造1....");


		}

		SateLite (String id,String name,int age,String country){

				this(id,name,age);
				
		
				this.country = country;


		}

			 SateLite(String a,int b){


				id = a;
				age = b;

				country = "美国";
	
			}

			SateLite(){

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

		private	int height ;


		public void 	setHeight(int x){

			//检查x的安全性


			if(x>360&&x<600){

				height = x;

			}

			else{


				return;

			}



		}


		public int getHeight(){

			//检查访问者的权限

			//合适


			return height;



		}

		




		}















