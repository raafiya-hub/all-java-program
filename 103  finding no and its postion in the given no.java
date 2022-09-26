import java.util.Scanner;
class New
{
  public static void main(String[]args)
   {
    Scanner sc=new Scanner(System.in);
     int i,k=0,j=0,s=0,n;
      int []x=new int [5];
       for(i=0;i<5;i=i+1)
        {
         System.out.print("enter values");
          x[i]=sc.nextInt();
          }
         System.out.print("enter n");
          n=sc.nextInt();
       for(i=0;i<5;i=i+1)
       {
      if(x[i]==n)
       {
        System.out.print(i+1);
       }
      }
  }
}