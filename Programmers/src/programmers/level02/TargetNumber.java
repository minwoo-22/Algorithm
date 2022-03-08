package programmers.level02;

public class TargetNumber {
    static int result = 0;
    
    public static void main(String[] args) {
        int[] numbers = {4,1,2,1};
        int target = 4;
        int answer = solution(numbers, target);
        System.out.println(answer);
    }
    
    private static int solution(int[] numbers, int target) {
        int answer = 0;
        method(numbers, 1, numbers[0], target);
        method(numbers, 1, -numbers[0], target);
        
        answer = result;
        return answer;
    }
    
    private static void method(int[] numbers, int n, int answer, int target) {
        if (n == numbers.length) {
            if (answer == target) result++;
        } else {
            method(numbers, n+1, answer+numbers[n], target);
            method(numbers, n+1, answer-numbers[n], target);
        }
    }
}
