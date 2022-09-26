import java.util.Scanner; 
class M
{ 
  public static void main(String[]args)
   {
    Scanner sc=new Scanner (System.in);
     System.out.print("enter numer");
     int l=sc.nextInt();
     int b=sc.nextInt();
     int a=l*b;
     int p=2*(l+b);
     System.out.println("Area is "+l);
     System.out.println("Peri is"+p);
   }
}