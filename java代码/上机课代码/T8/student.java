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

   if(course_name.equals("����")){

           return 60;
}
 
   else if(course_name.equals("��ѧ")){


           return 70;
}
   else{

           return 80;

}

}
String  findcourse(String zhou_ji){

      if(zhou_ji.equals("��һ")){

           return "����";
}
    else{

        return "û��";
}






}





}