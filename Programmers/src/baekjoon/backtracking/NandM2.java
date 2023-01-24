package baekjoon.backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class NandM2 {
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

    private static void backTracking(int number, int index) {
        if (M == index) {
            for (int num : sequence) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = number; i <= N; i++) {
            sequence[index] = i;
            backTracking(i + 1, index + 1);
        }
    }
}
