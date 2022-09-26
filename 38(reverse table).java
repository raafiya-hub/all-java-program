import java.util.Scanner;
class New
{
  public static void main(String[]args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.print(" enter values ");
      int a=sc.nextInt();
      
    
    int i;
       for(i=a*10;i>=a;i=i-a)
        {
            System.out.print(i);
        }
   }
}    