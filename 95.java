import java.util.Scanner;
class New
{
  public static void main(String[]args)
   {
    Scanner sc=new Scanner(System.in);
     int i,n,c=0,k=0;
     for(n=10;n<=40;n=n+1)
      {
        for(i=1;i<=n/2;i=i+1)
        {
            if (n%i==0)
             { 
               c=c+1;
    
             }
        }
          if(c==1)
          {
            k=k+n;
          }
     
     
  c=0;
  

   }


           System.out.println(k); 
   }
}
      

