
import java.awt.*;
import java.awt.event.*;

class A{


public static void main(String[] args){




		Frame  f = new Frame();

		f.setSize(400,200);

		f.setVisible(true);


		WindowHandle  wh = new WindowHandle();


		f.addWindowListener(wh);

		



}



}

class WindowHandle implements WindowListener{

public void windowActivated(WindowEvent e) {}
          //�� Window ����Ϊ� Window ʱ���á� 
public  void windowClosed(WindowEvent e)  {}
           //��Դ��ڵ��� dispose ������ر�ʱ���á� 
public  void windowClosing(WindowEvent e)  {


		System.exit(0);//�ر������ 

}
          // �û���ͼ�Ӵ��ڵ�ϵͳ�˵��йرմ���ʱ���á� 
public  void windowDeactivated(WindowEvent e)  {}
          // �� Window �����ǻ Window ʱ���á� 
public  void windowDeiconified(WindowEvent e)  {}
           //���ڴ���С��״̬��Ϊ����״̬ʱ���á� 
public  void windowIconified(WindowEvent e)  {}
           //���ڴ�����״̬��Ϊ��С��״̬ʱ���á� 
public  void windowOpened(WindowEvent e)  {}
           //�����״α�Ϊ�ɼ�ʱ���á� 




}