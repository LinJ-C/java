

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


		//�������ж�  aswd�� �Ƿ񱻰�����

		//ϵͳ�������¼�e   �а����˸��¼���������Ϣ

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

	System.out.println("���ƶ���....");


}

public void downmove(){

		//

	System.out.println("���ƶ���....");


}


public void rightmove(){

		//

	System.out.println("���ƶ���....");


}



public void upmove(){

		//

	System.out.println("���ƶ���....");


}
           
 public void keyReleased(KeyEvent e) {}
         
 public void keyTyped(KeyEvent e) {}
        



}












