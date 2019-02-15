package project.euler;

import org.junit.Assert;
import org.junit.Test;

public class PrimeNumber10001 {

   @Test
   public void nthPrime()
   {

       long start=System.currentTimeMillis();
       int i=1;
       int primeCounter=0;
       while(true)
       {
           if(isPrime(i))
           {
                 primeCounter++;
                 if(primeCounter== 10001)
                {
                    System.err.println(i);
                    break;
                }

           }
           i++;
       }
        System.err.println(System.currentTimeMillis()-start);
   }

   public boolean isPrime(int n)
   {
       if(n<=3)
       {
           return n>1;
       }
       else if(n%2==0||n%3==0)
       {
           return false;
       }
       int i=5;
       while ((i*i)<=n)
        {

            if(n%i==0||n%(i+2)==0)
                return false;
           i=i+6;
        }
       return true;
   }

   @Test
    public void testIsPrime()
   {
       Assert.assertTrue( !isPrime(25));
       Assert.assertTrue( isPrime(104759));
   }
}
