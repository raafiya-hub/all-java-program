import java.util.Scanner;
class New
{
  public static void main(String[]args)
  {
   Scanner sc=new Scanner(System.in);
    int n=10,c,p;
    System.out.print(" enter value");
    p=sc.nextInt();
     
   System.out.print(p);
    
 	if(p>=1 && p<=5)
 	 {
           c=n-p;
           System.out.print(" no of candies sold and left is" +c);
         }
      
	else
	  {
            System.out.print("invalid input");
          }
  }
}