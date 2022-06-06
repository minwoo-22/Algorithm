package programmers.level02;

public class ExpectedTable {
    public static void main(String[] args) {
        int n = 8;
        int a = 3;
        int b = 4;
        
        int result = solution(n, a, b);
        System.out.println(result);
    }
    
    private static int solution(int n, int a, int b) {
        int answer = 0;
        
        while (a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            answer++;
        }
        
        return answer;
    }
}
