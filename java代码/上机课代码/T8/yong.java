class yong{
    
    public static void main(String [] arge){

 
        student linj = new student("15","�ֽ�",20,"A","��");
        school  fangzai = new school("001","fangzai",1000,"һ","��������");

      int danke = linj.findscore("��ѧ");
    
      String kecheng = linj.findcourse("�ܶ�");
     
      String jijie=fangzai.zhuanye("�����");

      String shangke=fangzai.jiaqi("1");
  
   System.out.println(shangke);
         System.out.println(kecheng);
    System.out.println(jijie);
           System.out.println(danke);
          System.out.println(linj.sex);
     System.out.println(fangzai.where);





}

   


}