package baekjoon.numberTheory;

import java.io.*;
import java.util.StringTokenizer;

public class Ring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] radius = new int[N];
        for (int i = 0; i < N; i++) {
            radius[i] = Integer.parseInt(st.nextToken());
        }
        // 분모
        int numerator = radius[0];
        for (int i = 1; i < N; i++) {
            // 분자
            int denominator = radius[i];
            int factor = 1;
            for (int j = 2; j <= denominator; j++) {
                if (numerator % j == 0 && denominator % j == 0) {
                    factor = j;
                }
            }
            sb.append(radius[0]/factor).append("/").append(denominator/factor).append("\n");
        }

        System.out.println(sb.toString());
    }
}