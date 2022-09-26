import java.util.Scanner; 
class M
{ 
  public static void main(String[]args)
   {
    Scanner sc=new Scanner (System.in);
     System.out.print("enter numer");
     int a=sc.nextInt();  
     if (a<0)
     System.out.print("negative no.");
     else if(a>0)
     System.out.print("postive no.");
     else
      System.out.print("zero no.");
   }
}