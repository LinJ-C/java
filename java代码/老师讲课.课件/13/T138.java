
import java.io.*;



class T138{




public static void main(String [] args) throws Exception{


		File f =  new File("d:\\stu2.txt");

		RandomAccessFile  ra = new RandomAccessFile(f,"rw");


	long start = System.currentTimeMillis() ;

		int x = ra.read();


	

		while(x!=-1){

			x = ra.read();

		}


	long end= System.currentTimeMillis() ;

	System.out.println(end-start);

		ra.close();

	



}



}









