package baekjoon.bruteforce;

import java.io.*;

public class MovieDirector {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int num = 666;
        int cnt = 1;

        while (cnt < N) {
            num++;
            String strNum = String.valueOf(num);
            if (strNum.contains("666")) {
                cnt++;
            }
        }

        System.out.println(num);
    }
}