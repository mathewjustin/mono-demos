package project.euler;

import org.junit.Test;

public class PrimeNumber10001 {

   @Test
   public void nthPrime()
   {

       long start=System.currentTimeMillis();
       primeNumberSupplierQueue s=new primeNumberSupplierQueue(100);
       int lim=18;
       Long poll=0l;
       while(lim>0)
       {
           poll = s.poll();
           System.err.println(poll);
           lim--;
       }
       System.err.println(poll);
       System.err.println(System.currentTimeMillis()-start);
   }
}
