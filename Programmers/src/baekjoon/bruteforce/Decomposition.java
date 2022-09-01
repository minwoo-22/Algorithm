package baekjoon.bruteforce;

import java.io.*;

public class Decomposition {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int size = N.length();
        
        // 반환값
        int answer = 0;
        int number = Integer.parseInt(N);
        int temp = number;
        
        while (temp != 0) {
            temp -= 1;
            if (decomposition(temp, size) == number) {
                answer = temp;
            }
        }
        System.out.println(answer);
    }
    
    public static int decomposition(int n, int size) {
        int answer = 0;
        answer += n;
        for (int i = size; i > 0; i--) {
            int r = (int) Math.pow(10, i-1);
            int a = n / r;
            n -= a * r;
            answer += a;
        }
        return answer;
    }
}
