package baekjoon.backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class NandM1 {
    static int N, M;
    static boolean[] check;
    static int[] sequence;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        check = new boolean[N];
        sequence = new int[N];

        backTracking(0);
        System.out.println(sb.toString());
    }

    private static void backTracking(int index) {
        if (M == index) {
            for (int i = 0; i < M; i++) {
                sb.append(sequence[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            if (check[i]) continue;
            check[i] = true;
            sequence[index] = i+1;
            backTracking(index+1);
            check[i] = false;
        }
    }
}
