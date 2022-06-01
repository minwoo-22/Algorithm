package programmers.level01;

import java.util.Arrays;

public class Budget {
    public static void main(String[] args) {
        int[] d = {2,2,3,3};
        int budget = 10;
        int answer = solution(d, budget);
        System.out.println(answer);
    }
    
    private static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if (budget < 0) break;
            answer++;
        }
        
        return answer;
    }
}
