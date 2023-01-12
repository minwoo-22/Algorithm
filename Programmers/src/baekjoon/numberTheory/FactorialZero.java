package baekjoon.numberTheory;

import java.io.*;

public class FactorialZero {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 1; i <= N; i++) {
            int number = i;
            while (number % 5 == 0) {
                count++;
                number /= 5;
            }
        }
        System.out.println(count);
    }
}