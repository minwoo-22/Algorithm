package baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PlusCycle {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // 카운트
        int cnt = 1;
        
        // 십의 자리
        int A = N / 10;
        // 일의 자리
        int B = N % 10;
        
        int sum = A + B;
        
        while ((B*10)+(sum%10) != N) {
            A = ((B*10)+(sum%10)) / 10;
            B = ((B*10)+(sum%10)) % 10;
            
            sum = A + B;
            cnt++;
        }
        
        System.out.println(cnt);
    }

}
