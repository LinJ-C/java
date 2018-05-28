

import java.awt.*;
import java.awt.event.*;

class T111{



public static void main(String [] args){

	
	Frame   f  =new Frame();



	Button bt1 = new Button("芝麻开门");

	//1；确定事件源  bt1

	//2:  确定 处理事件类型  ActionEvent

	 //:  干什么===>对象===〉类====> 接口ActionListener

	ZhiMa  zhima = new ZhiMa();


	bt1.addActionListener(zhima);

	





	Button bt2 = new Button("芝麻关门");


	bt2.addActionListener(zhima);


	

	f.add(bt1,"North");

	f.add(bt2,"South");

	f.setSize(400,300);
	f.setVisible(true);

	
	



}



}


class ZhiMa  implements  ActionListener {




public void actionPerformed(ActionEvent e){



		//处理代码

		//ko


		System.out.println("芝麻开门......");

		


}



}












