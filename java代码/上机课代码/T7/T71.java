
    import java.awt.*;
    import javax.swing.*;
class T71{

   public static void main(String[] args){

           // ��������   
   
      JFrame f= new JFrame("������");
     
// �����˵�
    
          MenuBar bar =new MenuBar();
          
          Menu m1 =new Menu("�༭");
      
          Menu m2 =new Menu("�鿴");
     
          Menu m3 =new Menu("����");           

          bar.add(m1);
          bar.add(m2);
          bar.add(m3);

          MenuItem  stardard=new MenuItem("��׼");
         
          MenuItem  science=new MenuItem("�鿴");
     
          m1.add(stardard);
          m1.add(science);   
  
       f.setMenuBar(bar);          
  
 //�����ı���
    
       JTextField display =new JTextField();
       f.add(display,"North");
//����ģ��   Ĭ����FlowLayout  ����  Frame Ĭ����Border �����ϱ���
                
              JPanel zong=new JPanel();
              JPanel left=new JPanel();
              JPanel right=new JPanel();
              JPanel up=new JPanel();
              JPanel down=new JPanel();
              
         f.add(zong,"Center");
                  
       BorderLayout border1=new BorderLayout();
          zong.setLayout(border1);
          zong.add(left,"West");
          zong.add(right,"Center");

       BorderLayout border2=new BorderLayout();
           right.setLayout(border2);       
           right.add(up,"North");
           right.add(down,"Center");

//����
       TextField  kong = new TextField();
        JButton mc = new JButton("MC");
	JButton mr = new JButton("MR");
	JButton ms = new JButton("MS");
	JButton mjia = new JButton("M+");

	GridLayout  grid5 = new GridLayout(5,1,4,4);
	left.setLayout(grid5);
	
        left.add(kong);
	left.add(mc);
	left.add(mr);
	left.add(ms);
	left.add(mjia);
//�ϰ��
      JButton Backspcae = new JButton("Backspcae");
      JButton ce = new JButton("CE");
      JButton  c = new JButton("C");
GridLayout  grid1 = new GridLayout(1,4,5,5);
      up.setLayout(grid1);
       up.add(Backspcae);
       up.add(ce);
       up.add(c);           
//�м�
          
        JButton bt0 = new JButton("0");
	JButton bt1 = new JButton("1");
	JButton bt2 = new JButton("2");
	JButton bt3 = new JButton("3");
	JButton bt4 = new JButton("4");
	JButton bt5 = new JButton("5");
	JButton bt6 = new JButton("6");	
	JButton bt7 = new JButton("7");
	JButton bt8 = new JButton("8");
	JButton bt9 = new JButton("9");


	bt0.setFont(new Font("PLAIN",Font.BOLD,25));

	bt0.setForeground(Color.red);

	JButton jia = new JButton("+");
	JButton jian = new JButton("-");
	JButton cheng = new JButton("*");
	JButton chu = new JButton("/");

	
	
	JButton dian = new JButton(".");

	JButton sqrt = new JButton("sqrt");
	JButton dao = new JButton("1/x");
	JButton yu = new JButton("%");
	JButton deng = new JButton("=");
	JButton jiajian = new JButton("+/-");


	GridLayout grid45 = new GridLayout(4,5,5,5);


	down.setLayout(grid45);

	down.add(bt7);
        down.add(bt8);
        down.add(bt9);
        down.add(chu);
        down.add(sqrt);
       
        down.add(bt4);
        down.add(bt5);
        down.add(bt6);
        down.add(cheng);
        down.add(yu);
     
	down.add(bt1);
	down.add(bt2);
	down.add(bt3);
	down.add(jian);
	down.add(dao);
	
	down.add(bt0);
        down.add(jiajian);
	down.add(dian);
	down.add(jia);
	down.add(deng);
	
	
	
	
	
	
	
	

         f.setSize(500,550);
         
         f.setVisible(true);

         


   }




}