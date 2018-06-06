 
class T52{
     public static void main(String [] args){
        int [] shu={12,32,15,65,59,64,98,75,132,77};
               int n=0;
             for(int i=0;i<shu.length-1;i++){
           
                     for(int j=i+1;j<shu.length;j++){
                 if(shu[i]<shu[j]){
                      n=shu[i];
                      shu[i]=shu[j];
                      shu[j]=n;                     
 } 
}
} 
for(int x:shu){
System.out.println(x);
}              
}
}

