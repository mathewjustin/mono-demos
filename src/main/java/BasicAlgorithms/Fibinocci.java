package BasicAlgorithms;

import java.util.HashMap;
import java.util.stream.IntStream;

/*Fibinocci with caching to improve performance*/
public class Fibinocci {

    public static void main(String[] args) {

        long l = System.currentTimeMillis();
        IntStream.range(0,10)
                .forEach(e->{
                    System.err.println(fibOf(e));
                });
        System.err.println("Total time "+ (System.currentTimeMillis()-l));
    }

    static HashMap<Integer,Integer>cache=new HashMap<>();

    public static int fibOf(int lim)
     {
         if(lim<=1)
         {
             return 1;
         }

         if(cache.get(lim)!=null)
         {
             return cache.get(lim);
         }else{
             int i = fibOf(lim - 1) + fibOf(lim - 2);
             cache.put(lim,i);
             return i;
         }
     }
}
