import java.util.Scanner;
class New
{
  public static void main(String[]args)
  {
   Scanner sc=new Scanner(System.in);
    System.out.print("enter number");
    int a=sc.nextInt();
int c,g,e,l;
    if(a>=10000 && a<=99999)
	{
      c=a%10;
      
	e=(a/100)%10;
     
	 g=a/10000;
      
      l=c+e+g;
       System.out.print(l);
        
        
            if(l%2==0)
              {
                 System.out.print("it is a even no:");
	      }
             else
	      { 
                System.out.print("it is a odd no:");
	      }        
        }
    
    else
     {
      System.out.print("invalid no:");
     }
   }
}