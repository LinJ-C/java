
class T51{
     public static void main(String [] args){
        int [] shu={12,32,15,65,59,64,98,75,132,77};
               int n=0;
             for(int i=0;i<shu.length;i++){
                     for(int j=0;j<i;j++){
                 if(shu[j]>shu[j+1]){
                      n=shu[j];
                      shu[j]=shu[j+1];
                      shu[j+1]=n;                     
 } 
}
} 
for(int x:shu){
System.out.println(x);
}              
}
}
