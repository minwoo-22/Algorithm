package programmers.level01;

public class Collatz {
    public static void main(String[] args) {
        long n = 626331;
        long answer = solution(n);
        System.out.println(answer);
    }
    
    private static long solution(long n) {
        long answer = 0;
        
        int cnt = 0;
        while(cnt < 500) {
            if (n%2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            cnt++;
            if (n == 1) break;
        }
        if (cnt == 500) {
            answer = -1;
        } else {
            answer = cnt;
        }
        System.out.println(n);
        System.out.println(cnt);
        return answer;
    }
    
    
}
