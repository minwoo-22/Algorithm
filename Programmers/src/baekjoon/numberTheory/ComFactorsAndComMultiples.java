package baekjoon.numberTheory;

import java.io.*;
import java.util.StringTokenizer;

public class ComFactorsAndComMultiples {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int commonFactor = 1;
        int commonMultiple = 1;

        // 첫 번째 수를 무조건 작은 수로 설정
        if (N > M) {
            int temp = N;
            N = M;
            M = temp;
        }

        // 먼저 최대공약수를 구한다.
        for (int i = 2; i <= N; i++) {
            if (N % i == 0 && M % i == 0) {
                commonFactor = i;
            }
        }

        int count = M / commonFactor;
        while (true) {
            int checkNum = commonFactor * count;
            if (checkNum % N == 0 && checkNum % M == 0) {
                commonMultiple = checkNum;
                break;
            }
            count++;
        }

        sb.append(commonFactor).append("\n").append(commonMultiple);
        System.out.println(sb.toString());
    }
}
