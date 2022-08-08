package baekjoon.loop;

import java.io.*;

public class Star2 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        br.close();
        
        for (int i = 1; i <= N; i++) {
            sb.append(" ".repeat(N-i));
            sb.append("*".repeat(i));
            sb.append("\n");
        }
        
        bw.write(sb.toString());
        bw.close();
    }

}
