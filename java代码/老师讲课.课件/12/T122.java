


class T122{



public static void main(String [] args){


	Send  t1 =new Send();

	Receive  t2 = new Receive();


	t1.start();
	t2.start();



}



}

class Send  extends Thread{

public void run(){

		while(true){

			System.out.println("·¢ËÍ########################");



		}

}

}



class Receive  extends Thread{


public void run(){



		while(true){

			System.out.println("·¢ËÍ...............");


		}



}

}








