package level01;

import java.util.Arrays;

public class GCD_LCM {

    public static void main(String[] args) {
        int n = 3;
        int m = 12;
        int[] answer = solution(n, m);
        System.out.println(Arrays.toString(answer));
    }
    
    private static int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int max = 0;    //최대공약수
        for (int i = 1; i <= n; i++) {
            if (n%i == 0 && m%i == 0) {
                max = i;
            }
        }
        
        int min = 0;    //최소공배수
        for (int i = 1; i <= n; i++) {
            if ((i*m) % n == 0) {
                min = m*i;
                break;
            }
        }
        
        answer[0] = max;
        answer[1] = min;
        return answer;
    }

}
