package baekjoon.backtracking;

import java.io.*;

public class NQeen {
    static int[] chess;
    static int N;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        chess = new int[N];
        dfs(0);
        System.out.println(count);
    }

    private static void dfs(int depth) {
        if (depth == N) {
            count++;
            return;
        }

        for (int i = 0; i < N; i++) {
            chess[depth] = i;
            if (isPossible(depth)) {
                dfs(depth+1);
            }
        }
    }

    private static boolean isPossible(int depth) {
        for (int i = 0; i < depth; i++) {
            if (chess[depth] == chess[i]) return false;

            if (Math.abs(depth-i) == Math.abs(chess[depth] - chess[i])) return false;
        }
        return true;
    }
}
