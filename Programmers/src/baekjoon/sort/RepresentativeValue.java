package baekjoon.sort;

import java.io.*;
import java.util.Arrays;

public class RepresentativeValue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] numbers = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
            sum += numbers[i];
        }

        Arrays.sort(numbers);

        sb.append(sum/5).append("\n").append(numbers[2]);
        System.out.println(sb.toString());
    }
}