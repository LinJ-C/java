
import java.io.*;

class T133{

	public static int count = 0;


public static void main(String [] args) throws Exception{


			File dir = new File("c:\\");


			scanDir(dir);


			System.out.println("�����ļ�������"+count+"���ļ�");


			


}



	public static 	void scanDir(File  dir ) throws Exception{


		File[]  files = dir.listFiles();

		if(files==null){  return ;}

		//�����Ϊ��

		for(int i=0;i<files.length;i++){


			if(files[i].isFile()){


				String path = files[i].getAbsolutePath();

				System.out.println(path);

				count++;

			}


			else if(files[i].isDirectory()){


				scanDir(files[i]);	


			}

			else{


				

			}

		}

		
		






	}



}










