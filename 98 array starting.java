import java.util.Scanner;
class New
{
  public static void main(String[]args)
   {
    Scanner sc=new Scanner(System.in);
     int i;

      int []x=new int[5];
       for(i=0;i<5;i++)
       {
        System.out.print("enter values");
         x[i]=sc.nextInt();
        }
      for(i=0;i<5;i++)
      {
       System.out.println(x[i]);
      }
   }
} 