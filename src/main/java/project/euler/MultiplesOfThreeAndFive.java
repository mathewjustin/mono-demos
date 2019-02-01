package project.euler;


import lombok.extern.slf4j.Slf4j;

import java.util.stream.IntStream;

/*https://projecteuler.net/problem=1*/
@Slf4j
public class MultiplesOfThreeAndFive {

    public int multiplesOf(int start, int end) {

        return IntStream.range(start, end).boxed()
                .filter(e -> e % 3 == 0 || e % 5 == 0).mapToInt(Integer::intValue).sum();

    }

}
