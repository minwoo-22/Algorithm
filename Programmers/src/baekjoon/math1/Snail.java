package baekjoon.math1;

import java.io.*;
import java.util.StringTokenizer;

public class Snail {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        br.close();
        
        int cnt = 1;
        int num = A - B;
        V -= A;
        
        int result = V / num;
        int remain = V % num;
        if (remain == 0) {
            cnt += result;
        } else {
            cnt += result + 1;
        }
        
        bw.write(String.valueOf(cnt));
        bw.close();
    }
}
