package baekjoon.sort;

import java.io.*;

public class Sort3_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        // 숫자의 범위는 1 ~ 10000
        int[] numbers = new int[10001];

        for (int i = 0; i < N; i++) {
            // 입력한 숫자의 인덱스 값 +1
            numbers[Integer.parseInt(br.readLine())] += 1;
        }

        for (int i = 1; i < numbers.length; i++) {
            while (numbers[i] > 0) {
                sb.append(i).append("\n");
                numbers[i] -= 1;
            }
        }
        System.out.println(sb.toString());
    }
}
