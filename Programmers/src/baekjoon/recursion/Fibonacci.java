package baekjoon.recursion;

import java.io.*;

public class Fibonacci {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        System.out.println(fibo(N));
    }
    
    private static int fibo(int n) {
        int answer = 0;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            answer = fibo(n-2) + fibo(n-1);
        }
        
        return answer;
    }

}
