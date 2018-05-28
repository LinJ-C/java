

		import java.util.*;
		class T51{

public static void main(String [] args){

	int heights[] ={23,41,41,34,234,234,32,2,43532,52,43};

		//打个时间戳x

	long  x1 = System.currentTimeMillis() ;

	
	Arrays.sort(heights);

	//打个时间戳y




	//System.out.println(y1-x1);

	for(int x:heights){


		System.out.println(x);
	}
	long  y1 = System.currentTimeMillis() ;

	System.out.println(y1-x1);

		





	}


		

		
		

}
