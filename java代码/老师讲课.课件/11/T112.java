

import java.awt.*;
import java.awt.event.*;

class T112{



public static void main(String [] args){

	
	Frame   f  =new Frame();



	Button bt1 = new Button("֥�鿪��");

	//1��ȷ���¼�Դ  bt1

	//2:  ȷ�� �����¼�����  ActionEvent

	 //:  ��ʲô===>����===����====> �ӿ�ActionListener

	ZhiMa  zhima = new ZhiMa();


	bt1.addActionListener(zhima);

	





	Button bt2 = new Button("֥�����");


	bt2.addActionListener(zhima);

	WindowHandle  wh = new WindowHandle();

	
	f.addWindowListener(wh);


	

	f.add(bt1,"North");

	f.add(bt2,"South");

	f.setSize(400,300);
	f.setVisible(true);

	
	



}



}


class ZhiMa  implements  ActionListener {




public void actionPerformed(ActionEvent e){



		//�������

		//ko


		System.out.println("֥�鿪��......");

		


}



}


class WindowHandle implements WindowListener{


 public void windowActivated(WindowEvent e) {}
         
 public  void windowClosed(WindowEvent e) {}
         
 public  void windowClosing(WindowEvent e) {

		System.exit(0);

}
         
  public void windowDeactivated(WindowEvent e) {}
        
  public void windowDeiconified(WindowEvent e) {}
         
 public void windowIconified(WindowEvent e) {}
          
  public  void windowOpened(WindowEvent e){} 
      





}












