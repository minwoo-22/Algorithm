package baekjoon.recursion;

import java.io.*;

public class Factorial {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        System.out.println(factorial(N));
    }
    
    private static int factorial(int N) {
        int answer = N;
        if (N == 0) {
            return 1;
        } else {
            answer = N*factorial(N-1);
        }
        
        return answer;
    }

}
