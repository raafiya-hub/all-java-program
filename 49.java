import java.util.Scanner;
class New
 {
   public static void main(String[] args)
  {
    Scanner sc=new Scanner (System.in);
    System.out .print(" enter no.");
     int a=sc.nextInt();
      int b=sc.nextInt();
    
    
      int i;
        for(i=a;i<=b;i=i+1) 
             if(a%i==0 )
                      {
                          System.out.println( "  not a prime no"+i );
               	       }   
                   else{
         			 System.out.println(" prime no"+i);
              	       }
                   
                  
              
                      
         
   }
}
