package BasicAlgorithms;

public class PrintSeries {
/*          * * * * *
             * * * *
              * * *
               * *
                *
               * *
              * * *
             * * * *
            * * * * */

   public static void main(String[] args) {

        for (int i=1;i<=10;i++)
        {
            System.out.println("");
            for (int x=(6-i);x>0;x--)
            {
                System.out.print("*");
            }
            if((6-i)<=0)
            {
                for (int x=0;x<(i-5);x++)
                {
                    System.out.print("*");
                }
            }
        }

    }


}
