package baekjoon.oneDarray;

import java.io.*;

public class Assignment {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] students = new boolean[31];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 28; i++) {
            int num = Integer.parseInt(br.readLine());
            students[num] = true;
        }

        for (int i = 1; i < students.length; i++) {
            if (!students[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}