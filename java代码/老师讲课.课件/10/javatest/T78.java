




	//  ����ʽ�Ű�



import java.awt.*;


class T78{


public static void main(String [] args){

		Frame f =new Frame("������");

	


		MenuBar  bar = new MenuBar();

		Menu find = new Menu("�鿴");

		Menu  edit = new Menu("�༭");
		Menu  help  = new Menu("����");


		bar.add(find);
		bar.add(edit);		
		bar.add(help);

		MenuItem   kaobei = new MenuItem("����");

		MenuItem  zhantie = new MenuItem("ճ��");

		find.add(kaobei);
		find.add(zhantie);



	

		f.setMenuBar(bar);


		
		TextField  tx = new TextField();

		f.add(tx,"North");



		Panel  zong = new Panel();//Ĭ������ʽ

		Panel  left = new Panel();
		Panel  right = new Panel();

		right.setBackground(Color.red); 

		Panel  up = new Panel();

		up.setBackground(Color.green);
		Panel  down = new Panel();
		down.setBackground(Color.yellow);

	
		BorderLayout  border1 =new BorderLayout();



		zong.setLayout(border1);

		zong.add(left,"West");

		zong.add(right,"Center");



		BorderLayout  border2 =new BorderLayout();

		right.setLayout(border2);

		right.add(up,"North");
		right.add(down,"Center");


			
		

		
		TextField  keng = new TextField();

		Button mc = new Button("MC");
		Button mr = new Button("MR");
		Button ms = new Button("MS");
		Button jia = new Button("M+");

		left.setLayout(new GridLayout(5,1));
		
		left.add(keng);
		left.add(mc);
		left.add(mr);
		left.add(ms);
		left.add(jia);	
	
		Button bs= new Button("adfkajsdkfjaksd");
		Button ce = new Button("CE");
		Button c= new Button("C");

		up.add(bs);up.add(ce);up.add(c);

		down.setLayout(new GridLayout(4,5));

		for(int i=1;i<=20;i++){

			Button bt = new Button(""+i);

			down.add(bt);


		}
		
		

		

		f.add(zong,"Center");	




		f.setSize(257,244);

		f.setVisible(true);





}





}



















