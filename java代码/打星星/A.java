
	//���

	/*


		ѭ��   while  for  ()  while �������for

			

			

		��֧

			if ...

					if(){}

					else{}


			

				

			switch(     )   ��� 

			

		



	*/

	//

		




class A{


public static void main(String [] args){



			//�Ƚ϶�����

			//ÿ�ֱȽ϶��ٴ�

			int [] boxs = {3,3,3,42,34,2134,234,52,345,23,45,25,24,34,13,542,3,423,4,234,12,34,34};

			int n = boxs.length;

			for(int i=1;i<=n-1;i++){


				
					for(int j=1;j<=n-1;j++){



					

						  if(boxs[j-1] > boxs[j]){



								int tmp;

								tmp = boxs[j-1];
								boxs[j-1]= boxs[j];
								boxs[j] =tmp;
		
							}

					}


			}

			//����

			//�������鿴���

			for(int x:boxs){

				System.out.println(x);



			}

			
		
			














}


}