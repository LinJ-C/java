import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Ball  extends Frame {
	
	
	
	int x = 20 ;
	
	int y = 40;
	
	
	
		
    public void paint(Graphics g) {
    	
    	
    	//g ����  ������Ļ��� 
    	

    	
    	
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
			
			//����ֻ������� ����ֵ���޸� ������뿴�����ƶ�����Ҫ���»��� 
			
			
		    repaint();//��һ�������  paint
			
			
			
			
			
		}

		public void keyReleased(KeyEvent e) {
			
		}
		
		
		
		
		
	}

	
	
	
	
	

}


