
import java.io.*;

class T131{



public static void main(String [] args) throws Exception{

	

		File  f1 = new File("d:\\666.txt");


		System.out.println(f1.isHidden());

		System.out.println(f1.lastModified());
		f1.createNewFile();

		File  f2 = new File("d:\\aaa\\bbb\\ccc\\ddd");

		f2.mkdirs();

		File  f3 = new File("d:\\hhh");

		f3.createNewFile();
		File  f4 = new File("d:\\hhh.txt");


	
		f4.delete();
	
	
		File  f5 = new File("777.txt");

	
		if(!f5.exists()){
	
			f5.createNewFile();

		}

		System.out.println(f5.isAbsolute());


	



}



}










