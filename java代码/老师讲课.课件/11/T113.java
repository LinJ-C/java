

import java.awt.*;
import java.awt.event.*;

class T113{



public static void main(String [] args){

	
	Frame   f  =new Frame();


	KeyHandle  kh = new KeyHandle();

	
	

	 f.addKeyListener(kh);



	f.setSize(400,300);
	f.setVisible(true);

	
	



}



}

class KeyHandle implements KeyListener{


public void keyPressed(KeyEvent e) {


		//我们想判断  aswd键 是否被按下了

		//系统创建的事件e   中包含了该事件大量的信息

		char c = e.getKeyChar() ;


		switch(c){

			case 'a':  leftmove();break;

			case 's':  downmove();break;

			case 'd':  rightmove();break;

			case 'w':  upmove();break;

			


		}


		



}





public void leftmove(){

		//

	System.out.println("左移动中....");


}

public void downmove(){

		//

	System.out.println("下移动中....");


}


public void rightmove(){

		//

	System.out.println("右移动中....");


}



public void upmove(){

		//

	System.out.println("上移动中....");


}
           
 public void keyReleased(KeyEvent e) {}
         
 public void keyTyped(KeyEvent e) {}
        



}












