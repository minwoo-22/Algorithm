package baekjoon.numberTheory;

import java.io.*;
import java.util.StringTokenizer;

public class Bridge {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;
        int[][] pascal = new int[31][31];

        int T = Integer.parseInt(br.readLine());
        int N = 0;
        int M = 0;
        // 파스칼의 삼각형
        for (int j = 0; j < pascal.length; j++) {
            for (int k = 0; k <= j; k++) {
                if (j == 0 || k == 0) {
                    pascal[j][k] = 1;
                } else {
                    pascal[j][k] = pascal[j-1][k-1] + pascal[j-1][k];
                }
            }
        }

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            sb.append(pascal[M][N]).append("\n");
        }

        System.out.println(sb.toString());
    }
}