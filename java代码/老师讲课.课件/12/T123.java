


class T123{



public static void main(String [] args){


	Send  a =new Send();

	Receive  b = new Receive();

	Thread  t1 = new Thread(a);

	Thread t2  = new Thread(b);




	t1.start();



	t2.start();



}



}

class Send  implements Runnable{

public void run(){

		while(true){

			System.out.println("·¢ËÍ########################");



		}

}

}



class Receive   implements Runnable{


public void run(){



		while(true){

			System.out.println("·¢ËÍ...............");


		}



}

}








