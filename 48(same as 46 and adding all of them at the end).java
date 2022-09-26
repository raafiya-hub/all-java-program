import java.util.Scanner;
class New
 {
   public static void main(String[] args)
  {
    Scanner sc=new Scanner (System.in);
    System.out .print(" enter no.");
     int a=sc.nextInt();
  
      int i ,c=0;
        for(i=1;i<=10;i=i+1) 
             if(a%i==0  && i!=10 )
                c=c+i;
                 System.out.println(c);
              
                      
         
   }
}
