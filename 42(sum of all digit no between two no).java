import java.util.Scanner;
class New
 {
   public static void main(String[] args)
  {
    Scanner sc=new Scanner (System.in);
    System.out .print(" enter no.");
     int a=sc.nextInt();
     int b=sc.nextInt();

     int i ,result=0;
    for(i=a;i<=b;i=i+1)
     result=result+i;
      System.out.print(result);
               
         
   }
}