package programmers.level01;

import java.util.Arrays;

public class XN {

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        long[] answer = solution(x, n);
        System.out.println(Arrays.toString(answer));
    }
    
    private static long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        int j = 0;
        long result = 0;
        for (int i = 1; i <= n; i++) {
            answer[j] = result+x;
            result = answer[j];
            j++;
        }
        
        return answer;
    }
}
