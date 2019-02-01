package project.euler;

import org.junit.Test;

import java.math.BigInteger;

public class EvenFibinocciNumbersTest {

    EvenFibinocciNumbers evenFibinocciNumbers=new EvenFibinocciNumbers();
        @Test
        public void testFibinocci(){
            /*Long number,Long []cacheArray,Long lim,Long evenSums*/

/*
            Long integer = evenFibinocciNumbers.cachedFinbinocci(new Long(0L),4000000L,new Long(0L));
*/


            BigInteger integer = evenFibinocciNumbers.cachedFinbinocci(BigInteger.valueOf(0L),
                     3299L,
                    BigInteger.valueOf(0L)
            );

        System.err.println(integer.toString());
    }
}
