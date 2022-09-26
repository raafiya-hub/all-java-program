import java.util.Scanner;
class New
{
  public static void main(String[]args)
  {
   Scanner sc=new Scanner(System.in);
   

     System.out.print(" enter choice ");
      int p1=sc.nextInt();
      int a,b,c,d,e,f,g,h,ij,k;
      
      
       
 
   switch(p1)
   
    {
      
     case 1:
              System.out.print(" enter marks ");
                k=sc.nextInt();
    		b=sc.nextInt();
		c=sc.nextInt();
     
                tot=a+b+c;
                 g=tot/3*100;
                 if (g>=75)
                 {
                  System.out.print("A"); 
   		}
		 break;  
    
                 else if (g>=50)
                  {
                  System.out.print("B"); 
   		  }
		 break;  

		 else
                 {
                  System.out.print("fail"); 
   		}
	     break;  
   
    case 2:
             System.out.print(" call");
	       e=sc.nextInt();
              if(a>=1 && a<=100)
      {
   	    
    	     System.out.print( 200);
    	  }
   	   else if(a>=101 && a<=200)
           { 
             d=200+(a-100)*3;
            System.out.print("total call=" +d);
          }

           else if(a>=500 && a<=1000)
                {  
                  e=200+300*(a-200)*5;
                System.out.print("total call=" +e);
                } 
          else
              {
               System.out.print("zero");
    		}
      default:
            
            System.out.print("default value"); 
    

     }
   }
}