import java.util.Scanner;
class New
{
 public static void main(String[]args)
  {    
    Scanner sc=new Scanner(System.in);
    System.out.print("enter marks");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
    int e=sc.nextInt();
 
     int tot=a+b+c+d+e;
      int per=(tot%5)*100;
    if (per>=75)
     System.out.print("A");
     else if(per>=60)
      System.out.print("B");
     else if (per>=40)
     System.out.print("c");
     else 
      System.out.print("fail");

  }
}
    