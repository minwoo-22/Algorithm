package baekjoon.sort;

import java.io.*;
import java.util.*;

public class AgeSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringBuilder[] names = new StringBuilder[201];

        for (int i = 1; i < names.length; i++) {
            names[i] = new StringBuilder();
        }
        for (int i = 0; i < N; i++) {
            String data = br.readLine();
            int idx = Integer.parseInt(new StringTokenizer(data).nextToken());
            names[idx].append(data).append("\n");
        }

        for (int i = 0; i < names.length; i++) {
            // null이 아니면
            if (names[i] != null) {
                sb.append(names[i]);
            }
        }

        System.out.println(sb.toString());
    }
}
