

import java.awt.*;
import java.awt.event.*;

class T121{



public static void main(String [] args){

	
	Frame   f  =new Frame();


	Button bt =new Button();

	f.add(bt,"North");


	
	bt.addActionListener( new ActionListener(){





			public void actionPerformed(ActionEvent e){

				System.exit(0);

			}





	});



	
	

	
	




	f.setSize(600,300);
	f.setVisible(true);

	
	



}



}










