

		import java.util.*;
		class T54{

public static void main(String [] args){

			
		int [] heights = {31,54,4,34,342,4,231,43,4,45,234,234,342,234,5423,34};			



		int n = heights.length;


		for(int i=1;i<=n-1;i++){


			for(int j=1;j<=n-i;j++){
				
				if(heights[j-1] > heights[j]){

					int temp = heights[j-1];

					heights[j-1]= heights[j];

					heights[j] = temp;



					}



			}
			
		}//ok


		for(int x:heights){


			System.out.println(x);
		}





		}


}



















