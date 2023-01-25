package baekjoon.backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class NandM3 {
    static int N, M;
    static int[] sequence;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        sequence = new int[M];
        backTracking(0);
        System.out.println(sb.toString());
    }

    private static void backTracking(int index) {
        if (M == index) {
            for (int val : sequence) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 1; i <= N; i++) {
            sequence[index] = i;
            backTracking(index+1);
        }
    }
}
