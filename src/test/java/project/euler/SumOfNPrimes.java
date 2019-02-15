package project.euler;

import org.junit.Test;

public class SumOfNPrimes {
//10

    @Test
    public void sumOfNNumbers(){
        long start=System.currentTimeMillis();
        long sum=0;
        for(int i=0;i<2000000;i++)
        {
            if(PrimeNumber10001.isPrime(i))
            {
               sum+=i;
            }
        }
        System.err.println(sum);
        System.err.println(System.currentTimeMillis()-start);
    }
}
