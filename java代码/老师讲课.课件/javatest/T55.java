

		import java.util.*;
		class T55{

public static void main(String [] args){

			
		int [] heights = {31,54,4,34,342,4,231,43,4,45,234,234,342,234,5423,34};			



		int n = heights.length;




		for(int i=1;i<=n-1;i++){




			for(int j=i;j<=n-1;j++){



					
				if(heights[i-1] > heights[j]){

					int temp = heights[i-1];

					heights[i-1]= heights[j];

					heights[j] = temp;



					}



			}
			
		}//ok


		for(int x:heights){


			System.out.println(x);
		}





		}


}



















