package baekjoon.bruteforce;

import java.io.*;
import java.util.StringTokenizer;

public class Chess {
    private static char BLACK = 'B';
    private static char WHITE = 'W';

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] chessCount = new int[N-8+1][M-8+1];
        char[][] chess = new char[2][M];
        int min = 0;

        // chess판은 한 줄씩 규칙적으로 배열되어 있다.
        // 처음 칸이 검은색인 체스판으로 가정한다.
        for (int i = 0; i < M; i++) {
            if (i % 2 == 0) {
                chess[0][i] = 'B';
                chess[1][i] = 'W';
            } else {
                chess[0][i] = 'W';
                chess[1][i] = 'B';
            }
        }

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                // 규칙적인 배열과 다르면 cnt 1 증가
                if (str.charAt(j) != chess[i % 2][j]) {
                    if (j < 8) {
                        chessCount[0][0]++;
                    } else {
                        chessCount[i-7][j-7]++;
                    }
                }
            }
        }

        Loop:
        for (int i = 0; i < chessCount.length; i++) {
            for (int j = 0; j < chessCount[0].length; j++) {
                int cnt = Integer.min(chessCount[i][j], 64-chessCount[i][j]);
                if (cnt == 0) {
                    break Loop;
                }
                if (min > cnt) {
                    min = cnt;
                }
            }
        }

        // 처음 칸이 검은색인 경우의 수만 알면 자연스럽게 흰색의 경우의 수도 알 수 있다.
        System.out.println(min);
    }
}