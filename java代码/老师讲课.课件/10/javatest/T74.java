






import java.awt.*;


class T74{


public static void main(String [] args){



		Frame  ff = new Frame(); //����һ������


		MenuBar  bar = new MenuBar();

		Menu  file = new Menu("�ļ�");

		Menu  edit = new Menu("�༭");


		bar.add(file);
		bar.add(edit);

		MenuItem  create  = new MenuItem("�½�");

		MenuItem  open = new MenuItem("��");

		MenuItem  save = new MenuItem("����");

		file.add(create);file.add(open);file.add(save);


		ff.setMenuBar(bar);


	

		Button bt = new Button("OK");

		TextField  username = new TextField("uuu");

		TextField   password = new TextField("ppp");

	

		


		
		
		
		ff.add(bt);

		ff.add(password);

		ff.add(username);

		TextArea   ta = new TextArea();


		ff.add(ta);


		


		Choice  ch = new Choice();


		ch.add("��");
		ch.add("Ů");

		ch.add("����");


		ff.add(ch);


		Checkbox  box1 = new Checkbox("�㽶",true);
		Checkbox  box2 = new Checkbox("ƻ��",true);
		Checkbox  box3 = new Checkbox("����",true);
		Checkbox  box4 = new Checkbox("����",true);


		ff.add(box1);
	
		ff.add(box4);

		ff.add(box2);
		ff.add(box3);




		CheckboxGroup  cg = new CheckboxGroup();

		
		Checkbox  c1 = new Checkbox("A",cg,true);
		Checkbox  c2 = new Checkbox("B",cg,true);
		Checkbox  c3 = new Checkbox("C",cg,false);
		Checkbox  c4 = new Checkbox("D",cg,true);
	
		ff.add(c1);
		ff.add(c2);
		ff.add(c4);
		ff.add(c3);
		



		ff.setSize(433,200);//���ô��ڵĴ�С

		ff.setVisible(true);//�ô�����ʾ


}





}



















