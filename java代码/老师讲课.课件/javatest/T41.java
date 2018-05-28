

		import java.io.*;
		import java.util.*;
		class T41{

public static void main(String [] args){

	int heights[] ={23,41,41,34,234,234,32,2,43532,52,43};

	maopao(heights);//调用冒泡

	//打印冒泡后的结果

	for(int x:heights){

		System.out.println(x);
	}

	

	

		




}


	public static 	void   maopao(int  [] aa){


		int n = aa.length;

		

	
		for(int i=1;i<=n-1;i++){

			for(int j=1;j<=(n-i);j++){

				if(aa[j-1] >  aa[j]){

				
					int tmp =0;

					tmp = aa[j-1];
					aa[j-1]=aa[j];
					aa[j] = tmp;

				}

			}




		}

		//结束




		}

		

		
		

}
