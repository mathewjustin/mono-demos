package project.euler;

import org.junit.Assert;
import org.junit.Test;

import javax.validation.constraints.AssertTrue;

public class PythagoreanTriplet {

    @Test
    public void sumOfPythTriplet(){
        int c=0;
        for(short a=0;a<=1000;a++){

            for(short b=0;b<=1000;b++){

                int sumOfab = a + b;
                c=1000- sumOfab;

               if(sumOfab+c==1000)
               {

                   if(isPythogorianTriplet(a,b,c))
                   {
                       System.err.println(a*b*c);
                   }
               }

            }
        }

    }

    private boolean isPythogorianTriplet(short a, short b, int c) {

        if(((a*a)+(b*b))!=(c*c))
        {
            return false;
        }
        return true;
    }

    @Test
    public void testPythTriplet()
    {
        short a=3;
        short b=4;
        short c=5;

        Assert.assertTrue(isPythogorianTriplet(a, b, c));
        c=12;
        Assert.assertFalse(isPythogorianTriplet(a, b, c));
    }
}
