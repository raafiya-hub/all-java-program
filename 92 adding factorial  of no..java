import java.util.Scanner;
class New
{
  public static void main(String[]args)
   {
    Scanner sc=new Scanner(System.in);
     System.out.print("enter no to find factorial ");
      int f=1,i,k=0;
       int n=sc.nextInt();
     for(n=5;n>=1;n=n-1)
      {
        for(i=n;i>=1;i=i-1)
        {
           f=f*i;
          
         
         } 
        k=k+f;
       }
       
        System.out.println(k);
       f=1;
   
      
    
   }
}
      

