import java.util.Scanner;
class New
 {
   public static void main(String[] args)
  {
    Scanner sc=new Scanner (System.in);    
    int  n, b=0,m=0,r=0;
    System.out .print(" enter no.");
      n=sc.nextInt();
   
   while(n!=0)
        {
         b=n%10;
          n=n/10;
         
         r=r*10+b;
       }
       
               System.out.println(r);			
          			
         
   
    
 }
}
       