
import java.io.File;
import java.util.Scanner;

class ZY2{

public static int count=0;
public static void main(String [] args) throws Exception{


	        Scanner key = new Scanner(System.in);
	         
			File dir = new File("c:\\");

		System.out.println("请输入您要查找的文件");
		
		   String findName = key.nextLine();
			
			scanDir(dir,findName);
        System.out.println(count);
			


}



	public static 	void scanDir(File  dir,String findName) throws Exception{


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


				scanDir(files[i], findName);	


			}

			else{


				

			}

		}

		
		






	}



}










