
class T103{



public static void main(String [] args){




			MainBoard  mb = new MainBoard();


			Phone pp = new Phone();

			mb.addUSB(pp);

			
			Mouse m = new Mouse();


			mb.addUSB(m);

			

			


}



}



		class USB{
			
			public void start(){

				System.out.println("usb.start...");



			}


			public void stop(){

				System.out.println("usb.stop...");


			}


		}



		class Phone extends USB{




			public void start(){

				System.out.println("phone.start...");



			}


			public void stop(){

				System.out.println("phone.stop...");


			}

			public void play(){

				System.out.println("liangzhu.........");



			}

		}


		class Mouse extends USB{


			public void start(){

				System.out.println("mouse.start...");



			}


			public void stop(){

				System.out.println("mouse.stop...");


			}



			}




	class MainBoard{



		public void addUSB(USB u){

			u.start();
			try{

			Thread.sleep(5000);
			}catch(Exception ex){}

			u.stop();

			u.play();

		}

		}






