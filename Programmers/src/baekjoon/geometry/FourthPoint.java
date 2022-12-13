package baekjoon.geometry;

import java.io.*;
import java.util.StringTokenizer;

public class FourthPoint {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;
        int[][] XY = new int[3][2];

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int tempX = Integer.parseInt(st.nextToken());
            int tempY = Integer.parseInt(st.nextToken());
            XY[i][0] = tempX;
            XY[i][1] = tempY;
        }

        if (XY[0][0] == XY[1][0]) {
            sb.append(XY[2][0]).append(" ");
            if (XY[0][1] != XY[2][1]) {
                sb.append(XY[0][1]);
            } else {
                sb.append(XY[1][1]);
            }
        } else {
            if (XY[1][0] == XY[2][0]) {
                sb.append(XY[0][0]).append(" ");
                if (XY[1][1] != XY[0][1]) {
                    sb.append(XY[1][1]);
                } else {
                    sb.append(XY[2][1]);
                }
            } else {
                sb.append(XY[1][0]).append(" ");
                if (XY[0][1] != XY[1][1]) {
                    sb.append(XY[0][1]);
                } else {
                    sb.append(XY[2][1]);
                }
            }
        }

        System.out.println(sb.toString());
    }
}