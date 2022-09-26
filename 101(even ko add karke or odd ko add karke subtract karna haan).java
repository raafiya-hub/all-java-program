import java.util.Scanner;
class New
{
  public static void main(String[]args)
   {
    Scanner sc=new Scanner(System.in);
     int i,k=0,j=0,s=0;
      int []x=new int [7];
       for(i=0;i<7;i=i+1)
        {
         System.out.print("enter values");
          x[i]=sc.nextInt();
          }
        
         for(i=0;i<=6;i=i+1)
         {
        if(x[i]%2==0)  
       {
         j=j+x[i];
       }
        else if (x[i]%2!=0)
        {

        k=k+x[i];
      
       }   
     }    
      if(j>k)
       {
         s=j-k;
        }
      else 
      {
       s=k-j;
       }
      System.out.print(s);
  }
}         