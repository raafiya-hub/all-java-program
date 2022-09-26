import java.util.Scanner;
class New
{
  public static void main(String[]args)
  {
   Scanner sc=new Scanner(System.in);
   

     System.out.print(" enter choice ");
      int p1=sc.nextInt();
      int a,b,c,d;
      
      
       
 
   switch(p1)
   
    {
      
     case 1:
              System.out.print(" enter a no ");
                a=sc.nextInt();
              if (a%2==0)
                  System.out.print("even no."); 
    break;  
   
    case 2:
             System.out.print(" enter two no");
	       a=sc.nextInt();
               b=sc.nextInt();
               d=a-b;
            System.out.print(d); 
    
   
      default:
            
            System.out.print("default value"); 
    

     }
   }
}