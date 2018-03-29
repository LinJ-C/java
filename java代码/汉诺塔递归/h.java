import java.util.*;
class h{
  public static void main(String args[]){
       Scanner key=new Scanner(System.in);
       System.out.println("ÇëÊäÈëÅÌ×ÓÊý£º");
       int n=key.nextInt();
        t.a(n,'a','b','c');  
      
 }
}
class t{
    public static void a(int n,char a,char b,char c){
       if(n==2){
        System.out.println(a+"-->"+b);
        System.out.println(a+"-->"+c);
        System.out.println(b+"-->"+c);
          }      
       
       else if(n>2){ 
                  
            a( n-1,a,c,b);
          System.out.println(a+"-->"+c);
            a(n-1,b,a,c);
               }
       }  
   }

