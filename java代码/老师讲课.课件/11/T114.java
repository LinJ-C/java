

import java.awt.*;
import java.awt.event.*;

class T114{



public static void main(String [] args){

	
	Frame   f  =new Frame();



	TextField  op1 = new TextField(10);
	TextField  op2 = new TextField(10);
	TextField  result = new TextField(10);

	Choice  ch = new Choice();

	ch.add("    +    ");ch.add("    -    ");ch.add("    *    ");ch.add("    /    ");


	Button bt = new Button("  =   ");


	FlowLayout  flow = new FlowLayout();


	f.setLayout(flow);

	f.add(op1);f.add(ch);f.add(op2);f.add(bt);f.add(result);


	
	

	
	




	f.setSize(600,300);
	f.setVisible(true);

	
	



}



}

