package programmers.level00;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumOfConsecutiveNumbers {
    public static void main(String[] args) {
        int num = 5;
        int total = 5;
        int[] answer;

        int starter = total + IntStream.range(0, num).map(i -> -i).sum();

        answer = IntStream.iterate(starter/num, i -> i+1)
                .limit(num)
                .toArray();

        System.out.println(Arrays.toString(answer));
    }
}
