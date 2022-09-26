import java.util.Scanner;
class New
{
  public static void main(String[]args)
  {
   Scanner sc=new Scanner(System.in);
    System.out.print(" entervalues ");
    int a=sc.nextInt();
     int b=sc.nextInt();
int d;
     System.out.print(" enter choice ");
      int c1=sc.nextInt();
    
 
   switch(c1)
   
    {
      
     case 1:
             d=a+b;
            System.out.print(d); 
    break;  
   
    case 2:
             d=a-b;
            System.out.print(d); 
    break;  
    case 3:
             d=a*b;
            System.out.print(d); 
    break;  
   
      default:
            
            System.out.print("default value"); 
    

     }
   }
}