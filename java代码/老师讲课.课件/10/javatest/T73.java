






import java.awt.*;


class T73{


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

		TextField  username = new TextField();

		TextField   password = new TextField();

	

		


		ff.add(bt);
		ff.add(username);
		ff.add(password);
		

		ff.setSize(433,200);//���ô��ڵĴ�С

		ff.setVisible(true);//�ô�����ʾ


}





}



















