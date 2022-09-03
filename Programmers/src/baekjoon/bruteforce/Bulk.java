package baekjoon.bruteforce;

import java.io.*;
import java.util.StringTokenizer;

public class Bulk {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int N = Integer.parseInt(br.readLine());
        int[] weight = new int[N];
        int[] height = new int[N];
        int cnt;
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            weight[i] = Integer.parseInt(st.nextToken());
            height[i] = Integer.parseInt(st.nextToken());
        }
        
        for (int i = 0; i < N; i++) {
            cnt = 1;
            for (int j = 0; j < N; j++) {
                // 같은 사람은 pass
                if (i == j) continue;
                if (weight[i] < weight[j] && height[i] < height[j]) {
                    cnt += 1;
                }
                // && 연산자를 쓰는 것 보다 if문 처리를 한번 더 하는 게 메모리가 덜 든다
//                if (weight[i] < weight[j]) {
//                    if (height[i] < height[j]) cnt += 1;
//                }
            }
            System.out.print(cnt + " ");
        }
    }
}
