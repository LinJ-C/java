
import java.io.*;



class T139{




public static void main(String [] args) throws Exception{


		File f =  new File("d:\\stu2.txt");

		RandomAccessFile  ra = new RandomAccessFile(f,"rw");


		byte [] bb = new byte[100];

		


	long start = System.currentTimeMillis() ;

		int length = ra.read(bb);


	

		while(length != -1){

			length  = ra.read(bb);

		}


	long end= System.currentTimeMillis() ;

	System.out.println(end-start);

		ra.close();

	



}



}









