package baekjoon.twoDarray;

import java.io.*;
import java.util.StringTokenizer;

public class ColoredPaper {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        // 총 넓이
        int total = 0;
        boolean[][] paper = new boolean[100][100];
        // 색종이 개수
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            // 도화지 채우기
            for (int j = y; j < y + 10; j++) {
                for (int k = x; k < x + 10; k++) {
                    if (!paper[k][j]) {
                        paper[k][j] = true;
                        total++;
                    }
                }
            }
        }
        System.out.println(total);
    }
}
