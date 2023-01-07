package baekjoon.numberTheory;

import java.io.*;
import java.util.StringTokenizer;

// 파스칼의 삼각형과 모듈러 연산을 이용한 풀이
// nCk = n-1Ck-1 + n-1Ck
// (a + b) % r = (a % r + b % r) % r
public class BinomialTheorem2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] pascal = new int[n+1][n+1];

        for (int i = 0; i < pascal.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 0 || j == 0) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = (pascal[i-1][j-1] + pascal[i-1][j]) % 10007;
                }
            }
        }

        System.out.println(pascal[n][k]);
    }
}