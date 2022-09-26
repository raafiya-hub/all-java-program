import java.util.Scanner;
class New
 {
   public static void main(String[] args)
  {
    Scanner sc=new Scanner (System.in);
    System.out .print(" enter no.");
     int a=sc.nextInt();
  
     int i;
        for(i=1;i<=20;i=i+1) 
             if(a%i==0 )
			{
                          System.out.println(i);
              
                       }
         
   }
}
