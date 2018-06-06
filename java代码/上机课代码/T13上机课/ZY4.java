import java.io.File;
import java.io.RandomAccessFile;


 class ZY4 {

 
  public static void main(String [] args) throws Exception{
	  
	  
	    
	     File f = new File("c:\\st.txt");
	     
	     RandomAccessFile ra = new RandomAccessFile(f,"rw");
	     
	     
	     ra.write("N5101  ".getBytes());
	     ra.write("成林       ".getBytes());
	     ra.write("男     ".getBytes());
	     ra.write("河北     ".getBytes());
	     ra.write("网瘾少年      ".getBytes());
	     
	     
	     ra.write("N5101    ".getBytes());
	     ra.write("der浩      ".getBytes());
	     ra.write("男      ".getBytes());
	     ra.write("河北      ".getBytes());
	     ra.write("der   ".getBytes());
	     
	     ra.write("N5101   ".getBytes());
	     ra.write("子懿      ".getBytes());
	     ra.write("男        ".getBytes());
	     ra.write("四川      ".getBytes());
	     ra.write("艺术       ".getBytes());
	
	     ra.write("N5101    ".getBytes());
	     ra.write("林江      ".getBytes());
	     ra.write("男         ".getBytes());
	     ra.write("四川        ".getBytes());
	     ra.write("帅           ".getBytes());
	
	     ra.close();
	  
  }



 }
