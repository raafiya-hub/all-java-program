import java.util.Scanner;
class New
{
  public static void main(String[]args)
  {
   Scanner sc=new Scanner(System.in);
    System.out.print("enter call");
    int a=sc.nextInt();
        int d,e;
     int c=200;
    if(a>=1 && a<=100)
      {
       
        System.out.print( c);
      }
    else if(a>=101 && a<=200)
      { 
        d=c+(a-100)*3;
        System.out.print("total call=" +d);
      }

    else if(a>=500 && a<=1000)
     {  
       e=c+300*(a-200)*5;
       System.out.print("total call=" +e);
     } 
    else
     {
    System.out.print("zero");
     }
   }
}