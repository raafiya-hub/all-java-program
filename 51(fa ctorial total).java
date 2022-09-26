import java.util.Scanner;
class New
 {
   public static void main(String[] args)
  {
    Scanner sc=new Scanner (System.in);    
    int i,n,p=0,q=0,r=0;
    System.out .print(" enter n");
      n=sc.nextInt();
    
        for(i=1;i<=n;i=i+1) 
          {
             
             System.out .print(" enter p");
             p=sc.nextInt();
             if(p>=1 && p<=15)
 		
                 q=200;
                
             else if(p>=16  && p<=40)
            
              q=q+100;
 	    
              else if(p>=41 && p<=60)
             
             q=q+200;
                      
             ;
              
             
    
          
     }    
 
     System.out.print(q);
      

         
   }
}
