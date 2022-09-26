import java.util.Scanner; 
class M
{ 
  public static void main(String[]args)
   {
    Scanner sc=new Scanner (System.in);
     System.out.print("enter numer");
     int a=sc.nextInt(); 
     int b=sc.nextInt();  
     if (a>b)
     System.out.print("a is gratest");
     else if(b>a)
     System.out.print("b is greatest");
     else
      System.out.print("equal");
   }
}