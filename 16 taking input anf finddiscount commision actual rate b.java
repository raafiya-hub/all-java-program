import java.util.Scanner; 
class M
{ 
  public static void main(String[]args)
   {
    Scanner sc=new Scanner (System.in);
     System.out.print("enter numer");
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
     int t=a+b+c;
     int d=t*30/100;
     int act=t-d;
     int com=t-act;
     System.out.println("tot is"+t);
     System.out.println("dis"+d);
     System.out.println("actual is "+act);
     System.out.println("commision is"+com);
   }
}