package project.euler;

import org.junit.Test;

public class SumOfSquares {

    @Test
    public void sumOfSquares(){
        long time=System.currentTimeMillis();
        int squaresTracker=1;
        int differenceTracker=1;
        int sumOfSquares=0;
        int sumOfNumbers=1;
        for (int i=2;i<=100;i++)
        {
            differenceTracker+=2;
             squaresTracker=squaresTracker+differenceTracker;
             sumOfSquares+=squaresTracker;
            sumOfNumbers+=i;
        }
        sumOfSquares++;//started from 2nd

        System.err.println((sumOfNumbers*sumOfNumbers)-sumOfSquares);

        System.err.println((System.currentTimeMillis()-time));

    }
}
