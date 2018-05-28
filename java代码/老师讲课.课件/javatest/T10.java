

		import java.io.*;
		import java.util.*;
		class T10{

public static void main(String [] args){


		//Ã°ÅÝ

		int  [] heights = {172,186,163,176,174,159,161,188,176,164};

	
		for(int i=1;i<=9;i++){

			for(int j=1;j<=(10-i);j++){

				if(heights[j-1] >  heights[j]){

				
					int tmp =0;

					tmp = heights[j-1];
					heights[j-1]=heights[j];
					heights[j] = tmp;

				}

			}




		}

		//½áÊø

		for(int x:heights){
			System.out.println(x);

		}


		


}


}





			






































































