import java.util.Scanner;
class New
{
  public static void main(String[]args)
   {
    Scanner sc=new Scanner(System.in);
     int i,k=0,j;
      int []x=new int [7];
       for(i=0;i<7;i=i+1)
        {
         System.out.print("enter values");
          x[i]=sc.nextInt();
          }
          int m=x[0];
               for(i=0;i<7;i=i+1)
         {
           if(x[i]>m)
          m=x[i];
        
       
           
         }
          System.out.println(m);
         for(j=6;j>=0;j=j-1)
        
          System.out.println(x[j]);
         
     }
  }
 



          