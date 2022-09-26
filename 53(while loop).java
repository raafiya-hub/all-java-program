import java.util.Scanner;
class New
 {
   public static void main(String[] args)
  {
    Scanner sc=new Scanner (System.in);    
    int  n, b ;
    System.out .print(" enter no.");
      n=sc.nextInt();
   
   while(n!=0)
    {
       b=n%10;
       System.out.println(b);
       n=n/10;
   } 
    
 }
}
       