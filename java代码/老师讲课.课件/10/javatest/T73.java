






import java.awt.*;


class T73{


public static void main(String [] args){



		Frame  ff = new Frame(); //创建一个窗口


		MenuBar  bar = new MenuBar();

		Menu  file = new Menu("文件");

		Menu  edit = new Menu("编辑");


		bar.add(file);
		bar.add(edit);

		MenuItem  create  = new MenuItem("新建");

		MenuItem  open = new MenuItem("打开");

		MenuItem  save = new MenuItem("保存");

		file.add(create);file.add(open);file.add(save);


		ff.setMenuBar(bar);


	

		Button bt = new Button("OK");

		TextField  username = new TextField();

		TextField   password = new TextField();

	

		


		ff.add(bt);
		ff.add(username);
		ff.add(password);
		

		ff.setSize(433,200);//设置窗口的大小

		ff.setVisible(true);//让窗口显示


}





}



















