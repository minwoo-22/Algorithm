package programmers.level00;

import java.util.Arrays;

public class UnusualSort {
    public static void main(String[] args) {
        int[] numList = {10000,20,36,47,40,6,10,7000};
        int n = 30;

        int[] answer = solution(numList, n);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] solution(int[] numList, int n) {
        return Arrays.stream(numList)
                .boxed()
                .sorted((a, b) -> Math.abs(a - n) == Math.abs(b - n) ? b.compareTo(a) : Integer.compare(Math.abs(a - n), Math.abs(b - n)))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
