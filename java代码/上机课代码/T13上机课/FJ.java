
import java.io.*;



class FJ{




public static void main(String [] args) throws Exception{


		File f =  new File("c:\\aaa.txt");

		RandomAccessFile  ra = new RandomAccessFile(f,"rw");

           long start = System.currentTimeMillis() ;
		for(int i=1;i<=1000;i++){

                                       String s = "" + i;
                                  ra.write(s.getBytes());

				ra.write("a b c d ".getBytes());
                                   				

		}

long end = System.currentTimeMillis() ;
		ra.close();
               
	 System.out.println(end-start);



}



}









