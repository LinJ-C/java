import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Ball  extends Frame {
	
	
	
	int x = 20 ;
	
	int y = 40;
	
	
	
		
    public void paint(Graphics g) {
    	
    	
    	//g 就是  该组件的画笔 
    	

    	
    	
    	g.setColor(Color.red);
    	
    	
    	g.fillOval(x, y, 50, 50);
    	
    	
    	
    	
    	
    	
    	
    	
    }
	
	

	public static void main(String[] args) {

		
		new Ball().init();
		

	}

	
	
	public void init(){
		

		
		this.setSize(400,300);
		
		this.setVisible(true);
		
		
		KeyHandle  kh = new KeyHandle();
		
		this.addKeyListener(kh);
		
		
		
		
	}
	
	
	
	
	class KeyHandle implements KeyListener{

		public void keyTyped(KeyEvent e) {
			
			
			
			
			
			
		}

		public void keyPressed(KeyEvent e) {
			
			char c = e.getKeyChar();
			
			
			switch(c){
			
			
			case 'a':   x-=10;break;
			case 'd':   x+=10;break;
			case 'w':   y-=10;break;
			case 's':   y+=10;break;
			
			
			
			}
			
			//上面只是完成了 坐标值得修改 ，如果想看起来移动，需要重新绘制 
			
			
		    repaint();//它一定会调用  paint
			
			
			
			
			
		}

		public void keyReleased(KeyEvent e) {
			
		}
		
		
		
		
		
	}

	
	
	
	
	

}


