
import java.io.*;



class T136{




public static void main(String [] args) throws Exception{


		File f =  new File("d:\\stu.txt");

		RandomAccessFile  ra = new RandomAccessFile(f,"rw");



		ra.seek(38);

		byte [] bb = new byte[19];


		ra.read(bb);

		System.out.println(new String(bb,0,bb.length));


		ra.close();



}



}









