
import java.io.*;



class T135{




public static void main(String [] args) throws Exception{


			File f =  new File("d:\\stu.txt");

			RandomAccessFile  ra = new RandomAccessFile(f,"rw");


			ra.write("165041102".getBytes());
			ra.write("��ΰ".getBytes());
			ra.write("��".getBytes());
			ra.write("�ӱ�".getBytes());

			


			ra.write("165041103".getBytes());
			ra.write("��ΰ".getBytes());
			ra.write("Ů".getBytes());
			ra.write("����".getBytes());	

			ra.write("165041104".getBytes());
			ra.write("��ΰ".getBytes());
			ra.write("��".getBytes());
			ra.write("����".getBytes());


			ra.close();


}



}









