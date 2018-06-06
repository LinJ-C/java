
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
          //将 Window 设置为活动 Window 时调用。 
public  void windowClosed(WindowEvent e)  {}
           //因对窗口调用 dispose 而将其关闭时调用。 
public  void windowClosing(WindowEvent e)  {


		System.exit(0);//关闭虚拟机 

}
          // 用户试图从窗口的系统菜单中关闭窗口时调用。 
public  void windowDeactivated(WindowEvent e)  {}
          // 当 Window 不再是活动 Window 时调用。 
public  void windowDeiconified(WindowEvent e)  {}
           //窗口从最小化状态变为正常状态时调用。 
public  void windowIconified(WindowEvent e)  {}
           //窗口从正常状态变为最小化状态时调用。 
public  void windowOpened(WindowEvent e)  {}
           //窗口首次变为可见时调用。 




}