import java.util.Scanner;
class New
 {
   public static void main(String[] args)
  {
    Scanner sc=new Scanner (System.in);    
    int   n,b=0,r,c=0,i=0,result=0;
    System.out .print(" enter no.");
      n=sc.nextInt();
   while(n!=0)
       {
         b=n%10;
         n=n/10;
         for (i=1;i<=b/2;i=i+1);
         if( b%i==0)
          c=c+1;
        }
   System.out.print(c);
  }
}