import java.util.Scanner;
class New
{
  public static void main(String[]args)
  {
   Scanner sc=new Scanner(System.in);
    System.out.print(" enter marks ");
     
    int a1=sc.nextInt();
    int a2=sc.nextInt();
    int a3 =sc.nextInt(); 
    int b1=sc.nextInt();
    int b2=sc.nextInt();
    int b3 =sc.nextInt();
    int c1=sc.nextInt();
    int c2=sc.nextInt();
    int c3 =sc.nextInt();
     
    int t1=a1+b1+c1;
    int t2=a2+b2+c2;
    int t3=a3+b3+c3;
   
    if( t1>=t2 && t1>=t3)
      {
	System.out.print("t1 has highest marks"); 
       }   
  
      else if( t2>=t1 && t2>=t3)
      {
	System.out.print("t2 has highest marks"); 
       }   
  
       else if( t3>=t1 && t3>=t2)
      {
	System.out.print("t3 has highest marks"); 
       }   

  }
}   