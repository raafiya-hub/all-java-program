import java.util.Scanner;
class New
{
  public static void main(String[]args)
  {
   Scanner sc=new Scanner(System.in);
    int n;
    System.out.print(" enter values");
     int p=sc.nextInt();
     int q=sc.nextInt();
    int  r=sc.nextInt();
    
      if (p==q && r==p)
	{
           System.out.print("isoceles triangle");
	}
     else if(p==q || q==r || r==p)
	{
    	 System.out.print("equilateral triangle");
         }
     else
 	{
     System.out.print("scelar triangle");
	}
   }
}