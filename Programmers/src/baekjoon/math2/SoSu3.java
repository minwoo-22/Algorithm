package baekjoon.math2;

import java.io.*;
import java.util.StringTokenizer;

public class SoSu3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        br.close();
        // 숫자와 인덱스를 맞추기 위해 N+1개의 배열을 만든다
        boolean[] primeArr = new boolean[N+1];
        // 처음엔 true 값으로 초기화 
        for (int i = 2; i < primeArr.length; i++) {
            primeArr[i] = true;
        }
        // i의 제곱수가 N보다 작을 때까지 구한다.
        for (int i = 2; i*i <= N; i++) {
            if (primeArr[i]) {
                // j는 자신의 배수만큼 커지면서 약수들을 지운다.
                for (int j = i*i; j <= N; j += i) {
                    primeArr[j] = false;
                }
            }
        }
        
        for (int i = M; i < primeArr.length; i++) {
            if (primeArr[i]) {
                sb.append(i).append('\n');
            }
        }
        bw.write(sb.toString());
        bw.close();
    }
}
