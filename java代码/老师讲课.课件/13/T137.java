
import java.io.*;



class T137{




public static void main(String [] args) throws Exception{


		File f =  new File("d:\\stu2.txt");

		RandomAccessFile  ra = new RandomAccessFile(f,"rw");


		for(int i=1;i<=1000000;i++){


				ra.write("a".getBytes());

				

		}


		ra.close();

	



}



}









