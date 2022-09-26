import java.util.Scanner;
class New
 {
   public static void main(String[] args)
  {
    Scanner sc=new Scanner (System.in);
    System.out .print(" enter no.");
     int a=sc.nextInt();
     int b=sc.nextInt();

     int i,l ;
    for(i=a;i<=b;i=i+1)
       {
   	l=i%10;
         if(l%3==0 &&l!=0)

         System.out.println(i);
        }       
         
   }
}