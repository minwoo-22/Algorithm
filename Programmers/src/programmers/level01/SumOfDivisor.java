package level01;

public class SumOfDivisor {
    public static void main(String[] args) {
        int n = 5;
        int answer = solution(n);
        System.out.println(answer);
    }
    
    private static int solution(int n) {
        int answer = 0;
        int[] divisors = new int[n+1];
        int result = 0;
        
        for (int i = 1; i < divisors.length; i++) {
            if (n % i == 0) {
                if (divisors[i] == 1) break;
                result = n / i;
                divisors[i] = 1;
                divisors[result] = 1;
            }
        }
        
        for (int i = 1; i < divisors.length; i++) {
            if (divisors[i] == 1) answer += i;
        }
        
        return answer;
    }
}
