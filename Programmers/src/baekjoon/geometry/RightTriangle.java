package baekjoon.geometry;

import java.io.*;
import java.util.*;

public class RightTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        int[] lengths = new int[3];

        while (true) {
            st = new StringTokenizer(br.readLine());
            lengths[0] = Integer.parseInt(st.nextToken());
            lengths[1] = Integer.parseInt(st.nextToken());
            lengths[2] = Integer.parseInt(st.nextToken());

            if (lengths[0] == 0 && lengths[1] == 0 && lengths[2] == 0) {
                break;
            }

            Arrays.sort(lengths);
            // 피타고라스 법칙이 성립하면
            if (lengths[0]*lengths[0] + lengths[1]*lengths[1] == lengths[2]*lengths[2]) {
                sb.append("right").append("\n");
            } else {
                sb.append("wrong").append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}