
//GUI ���濪��

//ctrl+c ǿ�ƹر�  AT CMD

//java.awt.*;�ð��ṩ�����������

import java.awt.*;
class Calc{


public static void main(String [] args){




//����һ������

	Frame f = new Frame("������");



//��˵�

	MenuBar  bar = new MenuBar();

	Menu  m1= new Menu("�ļ�");

	Menu  m2 = new Menu("��ѧ");

	bar.add(m1);
	bar.add(m2);


	MenuItem  stardard = new MenuItem("��׼");


	MenuItem  science = new MenuItem("��ѧ");

	m1.add(stardard);
	m1.add(science);


	f.setMenuBar(bar);


//���ı���


	

	
	TextField  display = new TextField();

	f.add(display,"North");


//�����  ���� Ĭ����FlowLayout  ����  Frame Ĭ����Border �����ϱ���

	Panel  zong = new Panel(); 

	Panel  left = new Panel();

	Panel  right = new Panel();

	Panel  up = new Panel();


	Panel  down = new Panel();




	f.add(zong,"Center");


	BorderLayout border1 =  new BorderLayout();

	zong.setLayout(border1);

	zong.add(left,"West");

	zong.add(right,"Center");


	BorderLayout border2 =  new BorderLayout();

	right.setLayout(border2);

	
	right.add(up,"North");
	right.add(down,"Center");


//������

	TextField  keng = new TextField();
	Button mc = new Button("MC");
	Button mr = new Button("MR");
	Button ms = new Button("MS");
	Button mjia = new Button("M+");

	GridLayout  grid5 = new GridLayout(5,1,5,5);
	left.setLayout(grid5);
	
	left.add(keng);
	left.add(mc);
	left.add(mr);
	left.add(ms);
	left.add(mjia);

//������

	Button bs = new Button("Backspace");
	Button ce = new Button("CE");
	Button c = new Button("C");


	up.add(bs);up.add(ce);up.add(c);


//������

	Button bt0 = new Button("0");
	Button bt1 = new Button("1");
	Button bt2 = new Button("2");
	Button bt3 = new Button("3");
	Button bt4 = new Button("4");
	Button bt5 = new Button("5");
	Button bt6 = new Button("6");	
	Button bt7 = new Button("7");
	Button bt8 = new Button("8");
	Button bt9 = new Button("9");


	bt0.setFont(new Font("PLAIN",Font.BOLD,25));

	bt0.setForeground(Color.red);

	Button jia = new Button("+");
	Button jian = new Button("-");
	Button cheng = new Button("*");
	Button chu = new Button("/");

	
	
	Button dian = new Button(".");

	Button sqrt = new Button("sqrt");
	Button dao = new Button("1/x");
	Button yu = new Button("%");
	Button deng = new Button("=");
	Button jiajian = new Button("+/-");


	GridLayout grid45 = new GridLayout(4,5,5,5);


	down.setLayout(grid45);

	down.add(bt0);
	down.add(bt1);
	down.add(bt2);
	down.add(bt3);
	down.add(bt4);
	down.add(bt5);
	down.add(bt6);
	down.add(bt7);
	down.add(bt8);
	down.add(bt9);
	down.add(dian);
	down.add(jia);
	down.add(jian);
	down.add(cheng);
	down.add(chu);
	down.add(sqrt);
	down.add(dao);
	down.add(yu);
	down.add(deng);
	down.add(jiajian);
	

	
	


	f.setSize(300,400);


	f.setVisible(true);




}





}