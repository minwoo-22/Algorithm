package programmers.level01;

public class InsufficientAmount {

    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count = 4;
        long result = solution(price, money, count);
        System.out.println(result);
    }
    
    private static long solution(int price, int money, int count) {
        long answer = (long)money;
        for (int i = 0; i < count; i++) {
            answer -= (long)price * (i+1);
        }
        if (answer >= 0) {
            answer = 0;
        }
        return Math.abs(answer);
    }

}
