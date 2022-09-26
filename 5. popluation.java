class New
{
   public static void main(String[]args)
{
    int pop=7000,tm,tf,te,tue,tme,tfe,tfu,tmu;
    
       tm=pop*52/100;
       System.out.println("Total Male"+tm);
       tf=pop-tm;
       System.out.println("Total fe"+tf);      
     

       te=pop*58/100;
       System.out.println("Total te"+te); 
       tue=pop-te;
       System.out.println("Total tue"+tue);
     

       tme=te-tf;
       tfe=te-tme;
        System.out.println(tfe);
     
      tmu=tm-tme;
        System.out.println(tmu);
     
       tfu=tf-tfe;
        System.out.println(tfu);
      
       
    }
}