import java.util.Scanner;
class New
{
  public static void main(String[]args)
   {
    Scanner sc=new Scanner(System.in);
     System.out.print("enter values");
     int n=sc.nextInt();
     int f=1,b,i=0,k=0;
   
      while(n!=0)
       {
         b=n%10;
         n=n/10;
      
          for(i=b;i>=1;i=i-1)
            {
               f=f*i;
                
            }
           k=k+f;
f=1;
      }
      
     if(k==n)
      {
        System.out.print("strong no");
      }

      else
      {
      System.out.print("not a strong no");
        }
   
 }
}
   
         

