import java.io.File;
import java.io.RandomAccessFile;


 class ZY4 {

 
  public static void main(String [] args) throws Exception{
	  
	  
	    
	     File f = new File("c:\\st.txt");
	     
	     RandomAccessFile ra = new RandomAccessFile(f,"rw");
	     
	     
	     ra.write("N5101  ".getBytes());
	     ra.write("����       ".getBytes());
	     ra.write("��     ".getBytes());
	     ra.write("�ӱ�     ".getBytes());
	     ra.write("�������      ".getBytes());
	     
	     
	     ra.write("N5101    ".getBytes());
	     ra.write("der��      ".getBytes());
	     ra.write("��      ".getBytes());
	     ra.write("�ӱ�      ".getBytes());
	     ra.write("der   ".getBytes());
	     
	     ra.write("N5101   ".getBytes());
	     ra.write("��ܲ      ".getBytes());
	     ra.write("��        ".getBytes());
	     ra.write("�Ĵ�      ".getBytes());
	     ra.write("����       ".getBytes());
	
	     ra.write("N5101    ".getBytes());
	     ra.write("�ֽ�      ".getBytes());
	     ra.write("��         ".getBytes());
	     ra.write("�Ĵ�        ".getBytes());
	     ra.write("˧           ".getBytes());
	
	     ra.close();
	  
  }



 }
