package baekjoon.numberTheory;

import java.io.*;
import java.util.StringTokenizer;

public class LeastCommonMultiple {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int number1 = Integer.parseInt(st.nextToken());
            int number2 = Integer.parseInt(st.nextToken());

            if (number1 > number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            int multiple = number2;
            for (int j = 1; j <= number1; j++) {
                multiple = number2 * j;
                if (multiple % number1 == 0) {
                    sb.append(multiple).append("\n");
                    break;
                }
            }
        }

        System.out.println(sb.toString());
    }
}