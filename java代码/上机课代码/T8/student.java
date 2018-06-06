class student{
    
  String id;
   
  String name;
   
     int age ;
  
   String score;

    String sex;
  
student(String a,String b,int c,String d,String f){
   
        id = a;
 
      name = b;
  
      age = c;
 
      score = d;

       sex = f; 


    }
student(String a,String b,int c){


					id = a;
	
					name  = b;
 
                               age = c ;

        }

int findscore(String course_name){

   if(course_name.equals("语文")){

           return 60;
}
 
   else if(course_name.equals("数学")){


           return 70;
}
   else{

           return 80;

}

}
String  findcourse(String zhou_ji){

      if(zhou_ji.equals("周一")){

           return "满课";
}
    else{

        return "没课";
}






}





}