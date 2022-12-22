package baekjoon.geometry;

import java.io.*;
import java.util.StringTokenizer;

public class TheLittlePrince {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] x = new int[2];
        int[] y = new int[2];
        int[] c = new int[2];
        int r = 0;

        for (int i = 0; i < N; i++) {
            int count = 0;
            st = new StringTokenizer(br.readLine());
            x[0] = Integer.parseInt(st.nextToken());
            y[0] = Integer.parseInt(st.nextToken());
            x[1] = Integer.parseInt(st.nextToken());
            y[1] = Integer.parseInt(st.nextToken());

            int T = Integer.parseInt(br.readLine());
            for (int j = 0; j < T; j++) {
                st = new StringTokenizer(br.readLine());
                c[0] = Integer.parseInt(st.nextToken());
                c[1] = Integer.parseInt(st.nextToken());
                r = Integer.parseInt(st.nextToken());

                // 행성의 중심으로부터 출발지와 도착지 거리
                int startX = Math.abs(x[0] - c[0]);
                int startY = Math.abs(y[0] - c[1]);
                double start = Math.sqrt(startX * startX + startY * startY);
                int destinationX = Math.abs(x[1] - c[0]);
                int destinationY = Math.abs(y[1] - c[1]);
                double destination = Math.sqrt(destinationX * destinationX + destinationY * destinationY);

                if (start < r && destination > r) {
                    count++;
                } else if (destination < r && start > r) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb.toString());
    }
}