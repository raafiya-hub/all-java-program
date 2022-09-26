import java.util.Scanner;
class New
{
  public static void main(String[]args)
   {
    Scanner sc=new Scanner(System.in);
     System.out.print("enter no to find factorial ");
      int f=1,i,n,j;
       int a=sc.nextInt();  
        
              for(n=1;n<=a;n=n+2)
              {
                for(i=n;i>=1;i=i-1)
                 {
                   f=f*i;
                 }
               
       System.out.println(f);
        f=1;
             }
       

      
   }
}
      

