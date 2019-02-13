package project.euler;

import org.junit.Test;

public class SmallestEvenlyDivisible
{

    public static void main(String[] args) {

        smallestEvenlyDivisible();
    }


    public static void smallestEvenlyDivisible()
    {

        int number=20;
        short counter=0;
        long time=System.currentTimeMillis();
        while(true) {

            for (double i = 20; i >0; i--)
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
