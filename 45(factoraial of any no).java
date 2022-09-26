import java.util.Scanner;
class New
 {
   public static void main(String[] args)
  {
    Scanner sc=new Scanner (System.in);
    System.out .print(" enter no.");
     int a=sc.nextInt();
  
     int i,result=1;
        for(i=1;i<=a;i=i+1) 
             result=result*i; 
              System.out.println(result);
              
               
         
   }
}
