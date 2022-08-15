package baekjoon.math2;

import java.io.*;

public class Bertrand {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean[] check;
        int cnt = 0;
        
        while (N != 0) {
            check = new boolean[N*2+1];
            check[0] = check[1] = true;
            
            for (int i = 2; i*i <= N*2; i++) {
                if (!check[i]) {
                    // j는 자신의 배수만큼 커지면서 약수들을 지운다.
                    for (int j = i*i; j <= N*2; j += i) {
                        check[j] = true;
                    }
                }
            }
            
            for (int i = N+1; i < check.length; i++) {
                if (!check[i]) cnt++;
            }
            System.out.println(cnt);
            cnt = 0;
            N = Integer.parseInt(br.readLine());
        }
        br.close(); 
    }

}
