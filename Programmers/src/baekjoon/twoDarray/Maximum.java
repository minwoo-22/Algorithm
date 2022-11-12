package baekjoon.twoDarray;

import java.io.*;
import java.util.StringTokenizer;

public class Maximum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;
        int max = 0;
        int x = 1;
        int y = 1;

        Loop:
        for (int i = 1; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < 10; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num == 99) {
                    max = 99;
                    x = i;
                    y = j;
                    break Loop;
                }
                if (num > max) {
                    max = num;
                    x = i;
                    y = j;
                }
            }
        }
        br.close();
        sb.append(max).append("\n").append(x).append(" ").append(y);
        System.out.println(sb.toString());
    }
}
