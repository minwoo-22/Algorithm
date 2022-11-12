package baekjoon.twoDarray;

import java.io.*;
import java.util.StringTokenizer;

public class SumOfProcession {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[][] procession = new int[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];

        // 첫 번째 행렬
        for (int i = 0; i < procession.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < procession[0].length; j++) {
                procession[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 두 번째 행렬
        for (int i = 0; i < procession.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < procession[0].length; j++) {
                procession[i][j] += Integer.parseInt(st.nextToken());
                sb.append(procession[i][j]).append(" ");
            }
            sb.append("\n");
        }
        br.close();
        System.out.println(sb.toString());
    }
}
