package programmers.level00;

import java.util.ArrayList;

public class Factorization {
    public static void main(String[] args) {
        int[] answer;
        ArrayList<Integer> list = new ArrayList<>();

        int n = 420;
        int i = 2;

        while (i <= n) {
            int num = n % i;
            if (num == 0) {
                if (!list.contains(i)) {
                    list.add(i);
                }
                n /= i;
            } else {
                i++;
            }
        }
        answer = new int[list.size()];

        for (int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j);
        }

    }
}
