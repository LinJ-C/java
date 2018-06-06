class yong{
    
    public static void main(String [] arge){

 
        student linj = new student("15","林江",20,"A","男");
        school  fangzai = new school("001","fangzai",1000,"一","宇宙中心");

      int danke = linj.findscore("数学");
    
      String kecheng = linj.findcourse("周二");
     
      String jijie=fangzai.zhuanye("计算机");

      String shangke=fangzai.jiaqi("1");
  
   System.out.println(shangke);
         System.out.println(kecheng);
    System.out.println(jijie);
           System.out.println(danke);
          System.out.println(linj.sex);
     System.out.println(fangzai.where);





}

   


}