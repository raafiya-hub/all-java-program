import java.util.Scanner;
class New
{
  public static void main(String[]args)
  {
   Scanner sc=new Scanner(System.in);
    System.out.print("enter number");
    int a=sc.nextInt();
    if(a>0 && a<=2000)
	{
        
          System.out.print("25 min");
        }
        
         
    
    else if(a>2001 && a<=4000)
        {
          System.out.print("35 min");
         }
      else if(a>4000 && a<=7000)
         {
           System.out.print("45 min");
          }
     else 
           {
              System.out.print("invalid input");
    
           }
   }
}