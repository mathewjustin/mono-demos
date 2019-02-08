package project.euler;
import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;


class primeNumberSupplierQueue extends ArrayBlockingQueue<Long> {

    public primeNumberSupplierQueue(int capacity) {
        super(capacity);
        start = 0;
        end = 100;
        generatePrimes(start, end);
    }


    public boolean isPrime(long number) {

        if (number <= 3) {
            return number > 1;
        } else if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        long i = 6;

        while ((i * i) < number) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
            i = i + 6;
        }
        return true;
    }

    private long start;
    private long end;

  /*  public primeNumberSupplierQueue() {
        start = 0;
        end = 10;

        generatePrimes(start, end);
    }*/
//This method generate and pushes initial 200 primes to the stack,
//once stack size is reaches to certain limit fire thie method again to fill up

    public void generatePrimes(long start, long end) {
        for (long i = start; i <= end; i++) {
            if (isPrime(i)) {
            this.add(i);
            }
        }
    }


    @Override
    public Long poll() {
        if(this.size()<20)
        {
            start = end;
            end = end+100;
            generatePrimes(start, end);
        }
        return super.poll();
    }
}

public class LargestPrimeCustom {

    /*https://en.wikipedia.org/wiki/Primality_test*/

    int currentPrimeNumber = 1;
    /*Stack<Long> Primes = new primeNumberSupplierQueue();*/


    public void LargestPrime() {
        Long number = 600851475143L;

        int i = 1;
        while (number % nextPrime() == 0) {

        }

    }

    private Long nextPrime() {

        return null;
    }


   @Test
    public void testIsPrime() {
        long initTime=System.currentTimeMillis();
         primeNumberSupplierQueue s=new primeNumberSupplierQueue(200);
         long number=600851475143L;
       Long poll=0L;
       while (number>1)
             {
                  poll = s.poll();
                 if(number% poll ==0)
                 {
                     number=number/poll;
                 }
             }
       System.err.println(poll);

       System.err.println("total time "+(System.currentTimeMillis()-initTime ));
    }
}

