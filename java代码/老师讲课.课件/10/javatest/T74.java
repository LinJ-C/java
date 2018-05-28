






import java.awt.*;


class T74{


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

		TextField  username = new TextField("uuu");

		TextField   password = new TextField("ppp");

	

		


		
		
		
		ff.add(bt);

		ff.add(password);

		ff.add(username);

		TextArea   ta = new TextArea();


		ff.add(ta);


		


		Choice  ch = new Choice();


		ch.add("男");
		ch.add("女");

		ch.add("其他");


		ff.add(ch);


		Checkbox  box1 = new Checkbox("香蕉",true);
		Checkbox  box2 = new Checkbox("苹果",true);
		Checkbox  box3 = new Checkbox("菠萝",true);
		Checkbox  box4 = new Checkbox("橙子",true);


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
		



		ff.setSize(433,200);//设置窗口的大小

		ff.setVisible(true);//让窗口显示


}





}



















