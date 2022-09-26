import java.util.Scanner;
class New
 {
   public static void main(String[] args)
  {
    Scanner sc=new Scanner (System.in);    
    int  n, b,s=0 ;
    System.out .print(" enter no.");
      n=sc.nextInt();
   
   while(n!=0)
    {
       b=n%10;
       n=n/10; 
        
         s=s+1;
     }
         System.out.println(s);
       
   
    
 }
}
       