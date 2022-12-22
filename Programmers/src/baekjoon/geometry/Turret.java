package baekjoon.geometry;

import java.io.*;
import java.util.StringTokenizer;

public class Turret {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] x = new int[2];
        int[] y = new int[2];
        int[] r = new int[2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            x[0] = Integer.parseInt(st.nextToken());
            y[0] = Integer.parseInt(st.nextToken());
            r[0] = Integer.parseInt(st.nextToken());
            x[1] = Integer.parseInt(st.nextToken());
            y[1] = Integer.parseInt(st.nextToken());
            r[1] = Integer.parseInt(st.nextToken());

            // 두 터렛 사이의 거리
            int x_length = Math.abs(x[0] - x[1]);
            int y_length = Math.abs(y[0] - y[1]);
            double turretDistance = Math.sqrt(x_length * x_length + y_length * y_length);

            // 무조건 r1이 더 작다고 가정
            if (r[0] > r[1]) {
                int temp = r[0];
                r[0] = r[1];
                r[1] = temp;
            }

            if (turretDistance == r[0] + r[1]) {
                sb.append(1).append("\n");
            } else if (turretDistance < r[0] + r[1]) {
                if (turretDistance == 0) {
                    if (r[0] == r[1]) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                } else if (turretDistance + r[0] < r[1]) {
                    sb.append(0).append("\n");
                } else if (turretDistance + r[0] == r[1]) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(2).append("\n");
                }
            } else {
                sb.append(0).append("\n");
            }

        }

        System.out.println(sb.toString());
    }
}
