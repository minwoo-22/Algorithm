package programmers.level01;

public class IntegerSquareRoot {

    public static void main(String[] args) {
        long n = 121;
        long answer = solution(n);
        System.out.println(answer);
    }
    
    private static long solution(long n) {
        long answer = 0;
        double result = Math.sqrt(n);
        if ((result*10.0)%10.0 == 0.0) {
            answer = (long)Math.pow(result+1, 2.0);
        } else {
            answer = -1;
        }
        
        return answer;
    }
    

}
