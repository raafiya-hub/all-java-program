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
     if (a<b && a<c)
     System.out.print("a is smallest");
     else if(b<a && b<c)
     System.out.print("b is smallest");
     else
      System.out.print("c is smallest");
   }
}