import java.util.Scanner;
class New
{
  public static void main(String[]args)
   {
    Scanner sc=new Scanner(System.in);
     int i,k=0,j=0,s=0;
      int []x=new int [5];
       int []y=new int [5];
       int []z=new int [5];
 
       for(i=0;i<5;i=i+1)
        {
         System.out.print("enter values");
          x[i]=sc.nextInt();
          }
          for(i=0;i<5;i=i+1)
        {
         System.out.print("enter values");
          y[i]=sc.nextInt();
          }
       for(i=0;i<5;i=i+1)
        {
        z[i]=x[i]+y[i];
       System.out.println(z[i]);
       }
 } 
}
         