package level01;

public class AddDigits {

    public static void main(String[] args) {
        int n = 123;
        int answer = solution(n);
        System.out.println(answer);
    }
    
    private static int solution(int n) {
        int answer = 0;
        String number = String.valueOf(n);
        for (int i = 0; i < number.length(); i++) {
            answer += Integer.parseInt(number.charAt(i)+"");
        }
        
        return answer;
    }

}
