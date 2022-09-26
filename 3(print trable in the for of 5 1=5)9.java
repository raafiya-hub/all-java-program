import java.util.Scanner;
class New
{
  public static void main(String[]args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.print(" enter values ");
      int a=sc.nextInt();
      
    
    int i,p;
       for(i=1;i<=10;i=i+1)
        {
            p=a*i;
            System.out.println(a+ "*" +i+ "=" +p);
        }
   }
}    