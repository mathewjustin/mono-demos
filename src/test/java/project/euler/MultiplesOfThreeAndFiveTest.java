package project.euler;

import org.junit.Assert;
import org.junit.Test;

public class MultiplesOfThreeAndFiveTest {


    MultiplesOfThreeAndFive multiplesOfThreeAndFive=new MultiplesOfThreeAndFive();
    @Test
    public void testForZeroToNine()
    {
        Assert.assertEquals(multiplesOfThreeAndFive.multiplesOf(0,10),23);
    }

    @Test
    public void testForZeroTo1000()
    {
        Assert.assertEquals(multiplesOfThreeAndFive.multiplesOf(0,1000),233168);
    }
}
