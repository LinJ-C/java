

		import java.io.*;
		import java.util.*;
		class T44{

	public static int count = 0;

public static void main(String [] args) throws Exception{


			File f = new File("c:\\");

			scanDisk(f);

			System.out.println(count);
	
	

}


		//”≤≈Ã…®√Ë

		public static void scanDisk(File  fx) throws Exception{



		  File[]   files= fx.listFiles();

		if(files==null){return;}

		
		for(int i=0;i<files.length;i++){


			if(files[i].isFile()){

			String path = files[i].getAbsolutePath();
			System.out.println(path);
			count++;

			}
			else if(files[i].isDirectory()){

				scanDisk(files[i]);
			}



		}




		}





		

		
		

}
