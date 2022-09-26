import java.util.Scanner;
class New
{
  public static void main(String[]args)
  {
   Scanner sc=new Scanner(System.in);
    System.out.print("enter unit");
    int a=sc.nextInt();
    int c;

    if(a>=1 && a<=100)
      {
        c=2*unit;
        System.out.print("total rs");
      }
    else if(a>=200 && a<=400)
      { 
        c=4*unit;
        System.out.print("total rs");
      }

    else if(a>=500 && a<=1000)
     {  
       c=6*unit;
       System.out.print("total rs");
     } 
    else
     {
    System.out.print("no electricity connection");
     }
   }
}