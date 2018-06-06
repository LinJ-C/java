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

   if(zhuanye_name.equals("计算机")){

           return "一级";
}
 
   else if(zhuanye_name.equals("会记")){


           return "二级";
}
   else{

           return "垃圾";

}

}
String  jiaqi(String time){

      if(time.equals("1")){

           return "上课";
}
    else{

        return "发假";
}




}