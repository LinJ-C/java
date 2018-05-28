
import java.io.*;

class T132{


public static void main(String [] args) throws Exception{


			File dir = new File("c:\\");


			scanDir(dir);


			


}



	public static 	void scanDir(File  dir ) throws Exception{


		File[]  files = dir.listFiles();

		if(files==null){  return ;}

		//如果不为空

		for(int i=0;i<files.length;i++){


			if(files[i].isFile()){


				String path = files[i].getAbsolutePath();

				System.out.println(path);

			}


			else if(files[i].isDirectory()){


				scanDir(files[i]);	


			}

			else{


				

			}

		}

		
		






	}



}










