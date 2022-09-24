package baekjoon.sort;

import java.io.*;
import java.util.Arrays;

public class SortInside {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String N = br.readLine();
        char[] number = new char[N.length()];

        for (int i = 0; i < number.length; i++) {
            number[i] = N.charAt(i);
        }

        Arrays.sort(number);
        for (int i = number.length-1; i >= 0; i--) {
            sb.append(number[i]);
        }
        System.out.println(sb.toString());
    }
}
