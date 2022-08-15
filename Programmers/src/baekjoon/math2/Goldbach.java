package baekjoon.math2;

import java.io.*;

public class Goldbach {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        boolean[] primeArr;
        
        for (int i = 0; i < testCase; i++) {
            int N = Integer.parseInt(br.readLine());
            int index = 0;
            primeArr = new boolean[N+1];
            primeArr[0] = primeArr[1] = true;
            
            for (int j = 2; j*j <= N; j++) {
                if (!primeArr[j]) {
                    for (int k = j*j; k <= N; k += j) {
                        primeArr[k] = true;
                    }
                }
            }
            // 소수의 개수
            int primeCnt = getPrimeCnt(primeArr);
            // 소수를 넣을 배열
            int[] prime = new int[primeCnt];
            
            for (int j = 2; j <= N; j++) {
                if (!primeArr[j]) {
                    prime[index] = j;
                    index++;
                }
            }
            
            int[] pair = new int[2];
            pair[0] = prime[0];
            pair[1] = prime[prime.length-1];
            
            for (int j = 0; j < prime.length; j++) {
                for (int k = j; k < prime.length; k++) {
                    if ((prime[j] + prime[k] == N) && (Math.abs(prime[j] - prime[k]) < Math.abs(pair[0] - pair[1]))) {
                        pair[0] = prime[j];
                        pair[1] = prime[k];
                        break;
                    }
                }
            }
            
            System.out.println(pair[0] + " " + pair[1]);
        }
    }
    
    private static int getPrimeCnt(boolean[] primeArr) {
        int answer = 0;
        for (int i = 2; i < primeArr.length; i++) {
            if (!primeArr[i]) answer++;
        }
        return answer;
    }

}
