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
         System.out.println("�������½�û�����");
         u_name=key.nextLine();
   
       
         System.out.println("�������½���룺");
         u_password=key.nextLine();
       
           int i=0;
           String g_code="";
for( i=0;i<=3;i++){
                        
                     int r=(int)(Math.random()*63);
                    char c=k_code.charAt(r);                      
                       g_code+=c;
                      
                                 }
            
                      System.out.println("��֤��Ϊ��");     
                       System.out.println(g_code);
         
         System.out.println("��������֤�룺");
         y_code=key.nextLine();
  


              if(!(u_name.equalsIgnoreCase(r_name)&&u_password.equalsIgnoreCase(r_password))){


                     System.out.println("�û�����������󣬻���"+(2-n)+"");
}
                  if((!g_code.equalsIgnoreCase(y_code)&&u_name.equalsIgnoreCase(r_name)&&u_password.equalsIgnoreCase(r_password))){
                                   
                                   System.out.println("��֤�����");

                                  }    

                         

           if(g_code.equalsIgnoreCase(y_code)&&u_name.equalsIgnoreCase(r_name)&&u_password.equalsIgnoreCase(r_password)){
                       b_right=true;    
                   System.out.println("��½�ɹ���");
                     break;
}


                  }  
   
          if(b_right){
                   System.out.println("��ӭ����LinJ_world");                

}

  }
}
