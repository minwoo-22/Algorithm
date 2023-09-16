package programmers.level02;

import java.util.HashSet;

public class ContinuousSequence {
    public static void main(String[] args) {
        int[] elements = {7, 9, 1, 1, 4};
        HashSet<Integer> result = new HashSet<>();

        for (int i = 0; i < elements.length; i++) {
            // 몇 개를 더할 건지
            int sumLength = i + 1;
            for (int j = 0; j < elements.length; j++) {
                int sum = 0;
                int k = j;
                int cnt = 0;
                while (true) {
                    sum += elements[k % elements.length];
                    cnt++;
                    k++;
                    if (cnt == sumLength) break;
                }
                result.add(sum);
            }
        }

        System.out.println(result.size());
    }
}
