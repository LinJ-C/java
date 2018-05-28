
import java.io.*;
import java.util.*;


class T134{

	public static int count = 0;


public static void main(String [] args) throws Exception{


			Scanner  key =  new Scanner(System.in);

			



			System.out.println("请输入你要查找的文件名:");


			String findName =  key.nextLine();


			File dir = new File("c:\\");


			scanDir(dir,findName);


			System.out.println("整个文件夹下有"+count+"个文件");


			


}



public static 	void scanDir(File  dir ,String findName ) throws Exception{


		File[]  files = dir.listFiles();

		if(files==null){  return ;}

		//如果不为空

		for(int i=0;i<files.length;i++){


			if(files[i].isFile()){


				String fileName = files[i].getName();


				if(fileName.indexOf(findName)!=-1){


				System.out.println(files[i].getAbsolutePath());

				}

				




				count++;

			}


			else if(files[i].isDirectory()){


				scanDir(files[i],findName);	


			}

			else{


				

			}

		}

		
		






	}



}










