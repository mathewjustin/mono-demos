package project.euler;

import org.junit.Test;

public class LargestPalindrome {


    @Test
    public void palFromProduct()
    {
        Boolean found=false;
        long max=0l;
        for (long i=999;i>99;i--)
        {
            for (long x=999;x>99;x--)
            {
                long l = i * x;
                if(reverseNumber(l, 0l)==l)
                {
                    if(l>max)
                    {
                        max=l;
                    }
                }

            }

        }
        System.err.println(max);
    }

    @Test
    public void isPalindromeTest()
    {
         long s=100899;
         long x=998001;
         if(s==x){
             System.err.println("Equal");
         }

    }

    public long reverseNumber(long number, long reversed)
    {
        if(number==0)
        {
             return reversed;
        };

        long l=number%10;
        reversed=reversed*10+l;
        number=number/10;
        return reverseNumber(number,reversed);
    }
}
