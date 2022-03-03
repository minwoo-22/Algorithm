package level01;

public class PlusOfDivisor {
    public static void main(String[] args) {
        int left = 24;
        int right = 27;
        System.out.println(solution(left, right));
    }
    private static int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            int check = 0;
            for (int j = 1; j <= i; j++) {
                int remain = i % j;
                int result = i / j;
                
                if (remain == 0) {
                    System.out.println("i : " + i + ", j : " + j);
                    if (result != j && result > j) {
                        check += 2;
                    } else if (result == j) {
                        check += 1;
                    }
                    if (result < j) {
                        break;
                    }
                }
            }
            
            if (check % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        
        return answer;
    }
}
