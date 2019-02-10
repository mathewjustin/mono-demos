package project.euler;

import org.junit.Test;

public class SmallestEvenlyDivisible
{

    public static void main(String[] args) {
        System.err.println("Test");
    }

    @Test
    public void smallestEvenlyDivisible()
    {

        Boolean found=false;
        long number=10;
        int counter=0;
        long time=System.currentTimeMillis();
        while(!found) {


            for (int i = 1; i <= 20; i++)
            {
                if(number%i==0)
                {
                     counter++;
                }else{
                    break;
                }
            }
            if(counter==20)
            {
                System.err.println("Number found "+number);
                break;
            }
            counter=0;
            number++;
        }
        System.err.println("Total time"+ (System.currentTimeMillis()-time) );

    }
}
