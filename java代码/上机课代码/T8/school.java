class school{
    
  String id;
   
  String name;
   
     int near ;
  
   String jiben;

    String where;
  
school(String a,String b,int c,String d,String f){
   
        id = a;
 
      name = b;
  
      near = c;
 
      jiben = d;

       where = f; 


    }
school(String a,String b,int c){


					id = a;
	
					name  = b;
 
                               near = c ;

        }

String zhuanye(String zhuanye_name){

   if(zhuanye_name.equals("�����")){

           return "һ��";
}
 
   else if(zhuanye_name.equals("���")){


           return "����";
}
   else{

           return "����";

}

}
String  jiaqi(String time){

      if(time.equals("1")){

           return "�Ͽ�";
}
    else{

        return "����";
}




}