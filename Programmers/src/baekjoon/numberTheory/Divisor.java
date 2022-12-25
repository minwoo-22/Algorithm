package baekjoon.numberTheory;

import java.io.*;
import java.util.*;

public class Divisor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int N = Integer.parseInt(br.readLine());
        int[] divisors = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            divisors[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(divisors);

        if (N == 1) {
            System.out.println(divisors[0] * divisors[0]);
        } else {
            System.out.println(divisors[0] * divisors[divisors.length-1]);
        }
    }
}
