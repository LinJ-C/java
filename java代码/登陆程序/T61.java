             import java.util.*;
             class T61{
                   public static void main(String [] args){
                      
                      
         String r_name="linj";
         String r_password="1998";
         
         String u_name="";
         String u_password="";
         
         String y_code="";
         
         
         String k_code="123456789abcdefghijkmnopqrstuvwxyzABCDEFGHIJKMNOPQRSTUVWXYZ";
              
                 
                                  

         boolean b_right=false;
for(int n=0;n<=2;n++){

         Scanner key =new Scanner(System.in);
         System.out.println("请输入登陆用户名：");
         u_name=key.nextLine();
   
       
         System.out.println("请输入登陆密码：");
         u_password=key.nextLine();
       
           int i=0;
           String g_code="";
for( i=0;i<=3;i++){
                        
                     int r=(int)(Math.random()*63);
                    char c=k_code.charAt(r);                      
                       g_code+=c;
                      
                                 }
            
                      System.out.println("验证码为：");     
                       System.out.println(g_code);
         
         System.out.println("请输入验证码：");
         y_code=key.nextLine();
  


              if(!(u_name.equalsIgnoreCase(r_name)&&u_password.equalsIgnoreCase(r_password))){


                     System.out.println("用户名或密码错误，还有"+(2-n)+"");
}
                  if((!g_code.equalsIgnoreCase(y_code)&&u_name.equalsIgnoreCase(r_name)&&u_password.equalsIgnoreCase(r_password))){
                                   
                                   System.out.println("验证码错误！");

                                  }    

                         

           if(g_code.equalsIgnoreCase(y_code)&&u_name.equalsIgnoreCase(r_name)&&u_password.equalsIgnoreCase(r_password)){
                       b_right=true;    
                   System.out.println("登陆成功！");
                     break;
}


                  }  
   
          if(b_right){
                   System.out.println("欢迎来到LinJ_world");                

}

  }
}
