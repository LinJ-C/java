

		import java.util.*;
		class T53{

public static void main(String [] args){

		//�Ӷ�ά����;

		int money = 10;


		int zhu = money /2;
		

		for(int j=1;j<=zhu;j++){
		
			getOneZhu();
			System.out.println();
		


		}
		

}




		public static void getOneZhu(){


			int [] ball_pools = new int[36];


			//��ƹ����
			for(int i=0;i<ball_pools.length;i++){

				ball_pools[i] = (35-i);

			}

			
			for(int j=1;j<=7;j++){


			//�õ����������
		int pos = (int)(Math.random()*(37-j));//����±�;
		
			//�õ����������
		int last_pos  =  36-j; 

			//���߻�λ��

			int tmp = ball_pools[pos];

			ball_pools[pos] = ball_pools[last_pos];

			ball_pools[last_pos]= tmp;



		
				

				

			}

			//һע���


			for(int k=1;k<=7;k++){

				System.out.print(ball_pools[36-k]+"\t");

			}




		}



















}