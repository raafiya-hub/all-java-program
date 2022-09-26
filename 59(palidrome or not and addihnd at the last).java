import java.util.Scanner;
class New
 {
   public static void main(String[] args)
  {
    Scanner sc=new Scanner (System.in);    
    int   n,b=0,r=0,p=0,m=0,q=0;
    System.out .print(" enter no.");
      n=sc.nextInt();
    m=n;
   while(n!=0)
        {
         b=n%10;
          n=n/10;
         
         r=r*10+b;
         
       
       }
            if (r==m)
       
               System.out.println("palidrome");	
               
          else
       
         	System.out.println("not a palidrome");
       		
         q=m+r;
         System.out.println(q);
   
    
 }
}
       