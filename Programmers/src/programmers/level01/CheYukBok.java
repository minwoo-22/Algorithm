package programmers.level01;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheYukBok {

    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2,5,6};
        int[] reserve = {2,4,6};
        int answer = solution(n, lost, reserve);
        System.out.println(answer);
    }
    
    private static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] == lost[j]) {
                    answer += 1;
                    reserve[i] = 100;
                    lost[j] = 150;
                }
            }
        }
    
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] == 100) break;
                if (lost[j] == 150) continue;
                if (reserve[i]+1 == lost[j] || reserve[i]-1 == lost[j]) {
                    answer += 1;
                    reserve[i] = 100;
                    lost[j] = 150;
                    break;
                }
            }
        }
       
        return answer;
    }

}
