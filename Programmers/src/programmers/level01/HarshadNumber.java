package level01;

public class HarshadNumber {

    public static void main(String[] args) {
        int x = 11;
        boolean answer = solution(x);
        System.out.println(answer);
    }
    
    private static boolean solution(int x) {
        boolean answer = false;
        String number = String.valueOf(x);
        int result = 0;
        for (int i = 0; i < number.length(); i++) {
            result += number.charAt(i)-'0';
        }
        if (x%result == 0)answer = true;
        return answer;
    }
}
