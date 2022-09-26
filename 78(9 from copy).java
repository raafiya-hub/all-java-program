import java.util.Scanner;
class New
 {
   public static void main(String[] args)
  {
    Scanner sc=new Scanner (System.in);    
    int j,i;
     for(i=1;i<=5;i=i+1)
       {
          for(j=i;j>=1;j=j-1)
      		 { 
                      if(j%2==0)
      		   System.out.print(0);
                     else 
    			System.out.print(1);
     	         }
       
      System.out.println();   
     }
     
 }
}
   
   