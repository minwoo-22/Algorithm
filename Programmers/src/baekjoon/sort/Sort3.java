package baekjoon.sort;

import java.io.*;
import java.util.Arrays;

// Arrays.sort의 경우 dual-pivot Quick Sort 알고리즘을 사용한다.
public class Sort3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i] + "\n");
        }
        System.out.println(sb.toString());
    }
}
