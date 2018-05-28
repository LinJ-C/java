

		import java.util.*;
		class T53{

public static void main(String [] args){

		//从二维码来;

		int money = 10;


		int zhu = money /2;
		

		for(int j=1;j<=zhu;j++){
		
			getOneZhu();
			System.out.println();
		


		}
		

}




		public static void getOneZhu(){


			int [] ball_pools = new int[36];


			//放乒乓球
			for(int i=0;i<ball_pools.length;i++){

				ball_pools[i] = (35-i);

			}

			
			for(int j=1;j<=7;j++){


			//得到随机球坐标
		int pos = (int)(Math.random()*(37-j));//随机下标;
		
			//得到最后球坐标
		int last_pos  =  36-j; 

			//两者换位置

			int tmp = ball_pools[pos];

			ball_pools[pos] = ball_pools[last_pos];

			ball_pools[last_pos]= tmp;



		
				

				

			}

			//一注完成


			for(int k=1;k<=7;k++){

				System.out.print(ball_pools[36-k]+"\t");

			}




		}



















}