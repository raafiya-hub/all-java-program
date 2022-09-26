import java.util.Scanner;
class New
 {
   public static void main(String[] args)
  {
    Scanner sc=new Scanner (System.in);    
    int j,i;
     for(i=1;i<=5;i=i+1)
       {
          for(j=1;j<=10;j=j+1)
             {
                      if(i==j||j==11-i && j!=6)
      		   System.out.print("*");
			else
			 System.out.print(" ");
                                        
     	         }
        
       
      System.out.println();  
     }
     
 }
}
   
 