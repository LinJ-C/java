
import java.io.*;



class T135{




public static void main(String [] args) throws Exception{


			File f =  new File("d:\\stu.txt");

			RandomAccessFile  ra = new RandomAccessFile(f,"rw");


			ra.write("165041102".getBytes());
			ra.write("张伟".getBytes());
			ra.write("男".getBytes());
			ra.write("河北".getBytes());

			


			ra.write("165041103".getBytes());
			ra.write("王伟".getBytes());
			ra.write("女".getBytes());
			ra.write("河南".getBytes());	

			ra.write("165041104".getBytes());
			ra.write("赵伟".getBytes());
			ra.write("男".getBytes());
			ra.write("湖北".getBytes());


			ra.close();


}



}









