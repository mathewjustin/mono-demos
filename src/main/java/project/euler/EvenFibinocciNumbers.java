package project.euler;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Stack;

public class EvenFibinocciNumbers {

    BigInteger []cacheArray=new BigInteger[]{BigInteger.valueOf(1),BigInteger.valueOf(1)};


    public BigInteger cachedFinbinocci(BigInteger number, Long lim, BigInteger evenSums)
    {
         if(lim==0)
        {
            return number;
        }

        BigInteger current=cacheArray[0].add(cacheArray[1]);
        cacheArray[0]=cacheArray[1];
        cacheArray[1]=current;

        /*current%2==0*/
        if (current.mod(BigInteger.valueOf(2L)).compareTo(BigInteger.ZERO) == 0) {
                evenSums = evenSums.add(current);

        }
        return cachedFinbinocci(current,--lim,evenSums);
    }
}
