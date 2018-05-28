




	//  Õ¯∏Ò Ω≈≈∞Ê



import java.awt.*;


class T77{


public static void main(String [] args){

		Frame f =new Frame();

		
		GridLayout   grid  = new GridLayout (3,2);

		f.setLayout(grid);

		Button bt1 = new Button("      1         ");

		Button bt2 = new Button("      2       ");

		Button bt3= new Button("3");

		Button bt4= new Button("4");

		Button bt5 = new Button("5");


		f.add(bt1);

		f.add(bt2);
		f.add(bt3,"South");
		f.add(bt4,"West");
		f.add(bt5,"East");

		
		






		f.setSize(400,300);

		f.setVisible(true);





}





}



















