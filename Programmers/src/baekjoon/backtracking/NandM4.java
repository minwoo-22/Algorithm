package baekjoon.backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class NandM4 {
    static int N, M;
    static int[] sequence;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        sequence = new int[M];
        backTracking(1, 0);
        System.out.println(sb.toString());
    }

    private static void backTracking(int num, int index) {
        if (M == index) {
            for (int val : sequence) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = num; i <= N; i++) {
            sequence[index] = i;
            backTracking(num, index+1);
            num++;
        }
    }
}
