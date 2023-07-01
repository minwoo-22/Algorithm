package programmers.level02;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MakeMinimum {
    public static void main(String[] args) {
        int answer = 0;
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            answer += (A[i] * B[B.length - 1 - i]);
        }

        System.out.println(answer);
    }
}
