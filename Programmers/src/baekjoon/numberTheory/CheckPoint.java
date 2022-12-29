package baekjoon.numberTheory;

import java.io.*;

public class CheckPoint {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] factors = new int[N-1];
        int minFactor = 1000000000;

        int number1 = Integer.parseInt(br.readLine());
        for (int i = 0; i < N-1; i++) {
            int number2 = Integer.parseInt(br.readLine());
            factors[i] = Math.abs(number1 - number2);
            if (minFactor > factors[i]) {
                minFactor = factors[i];
            }
            number1 = number2;
        }

        for (int i = 2; i <= minFactor; i++) {
            for (int j = 0; j < N-1; j++) {
                if (factors[j] % i != 0) {
                    break;
                }
                if (j == N-2) {
                    sb.append(i).append("\n");
                }
            }
        }

        System.out.println(sb.toString());
    }
}