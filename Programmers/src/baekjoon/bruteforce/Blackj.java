package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Blackj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] card = new int[N];
        
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < N; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }
        
        int result = solution(N, M, card);
        System.out.println(result);
    }
    
    private static int solution(int N, int M, int[] card) {
        int answer = 0;
        int total = 0;
        int difNum = 500000;
        
        for (int i = 0; i < N-2; i++) {
            for (int j = i+1; j < N-1; j++) {
                for (int k = j+1; k < N; k++) {
                    total = sum(card[i], card[j], card[k]);
                    if (M - total >= 0 && difNum > M - total) {
                        difNum = M - total;
                        answer = total;
                    }
                }
            }
            if (difNum == 0) {
                break;
            }
        }
        return answer;
    }
    
    private static int sum(int n1, int n2, int n3) {
        return n1+n2+n3;
    }

}
