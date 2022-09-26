import java.util.Scanner;
class New
 {
   public static void main(String[] args)
  {
    Scanner sc=new Scanner (System.in);    
    int  n, b=0,s=0 ,p=0,q=0;
    System.out .print(" enter no.");
      n=sc.nextInt();
   
   while(n!=0)
    {
       b=n%10;					//checking 321
       n=n/10; 
       
        
         if(b%2==0)                            //for even 
          s=b+s;    				//store and add
          else if(b%2!=0)			//for odd
          p=b+p;				//adding and storing
          q=s-p;				//finally sub both even odd
          
     }
         System.out.println(q);			//print result of sub
       
   
    
 }
}
       