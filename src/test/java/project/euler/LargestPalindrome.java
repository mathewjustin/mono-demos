package project.euler;

public class LargestPalindrome {

    public static void main(String[] args) {
        long l1 = System.currentTimeMillis();
        palFromProduct();
        System.err.println(System.currentTimeMillis()-l1);
    }

    public static void palFromProduct()
    {
        int max=0;
        int bound=999;
        short biincre=0;
        short boundTracker=1;
        while(bound>99)//inner
        {
            int l=bound*(bound+biincre);
            if(reverseNumber(l)==l)
            {
                if(l>max)
                {
                    max=l;
                }
                biincre=0;
                bound=999-boundTracker;
                boundTracker++;
                continue;
            }
            bound--;
            biincre++;
            if(bound==100)
            {
                biincre=0;
                bound=999-boundTracker;
                boundTracker++;
            }
        }
        System.err.println(max);
    }



    public static int reverseNumber(int number)
    {
        int reversed=0;
        while (number>0)
        {
            int l=number%10;
            reversed=reversed*10+l;
            number=number/10;

        }
        return reversed;
    }
}
