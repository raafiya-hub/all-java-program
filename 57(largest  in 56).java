import java.util.Scanner;
class New
 {
   public static void main(String[] args)
  {
    Scanner sc=new Scanner (System.in);    
    int  n, b=0,m=0;
    System.out .print(" enter no.");
      n=sc.nextInt();
   
   while(n!=0)
       {
         b=n%10;					//checking 321
          n=n/10; 
       
        
         if(m<b)   
          {           
          m=b;    
          } 
       }        
          System.out.println(m);			
          			
         
   
    
 }
}
       