import java.util.Scanner;
class New
 {
   public static void main(String[] args)
  {
    Scanner sc=new Scanner (System.in);    
    int   n,b=0,r=0,p=0,m=0,c=0;
    System.out .print(" enter no.");
      n=sc.nextInt();
     m=n;
   while(n!=0)
        {
         b=n%10;
          n=n/10;
         c= c+b*b*b;
         }
          
     if(c==m)
     System.out.print("amstrong no " +c); 
      else 
     System.out.print("not amstrong");
  }
}       