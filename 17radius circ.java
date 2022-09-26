import java.util.Scanner; 
class M
{ 
  public static void main(String[]args)
   {
    Scanner sc=new Scanner (System.in);
     System.out.print("enter numer");
     float r=sc.nextFloat();
     float h=sc.nextFloat();
     float ar=3.14f*r*r;
     float c=2*3.14f*r;
     System.out.println("radius is"+r);
     System.out.println("cer is"+c);
   }
}