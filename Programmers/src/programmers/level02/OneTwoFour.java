package programmers.level02;

public class OneTwoFour {

    public static void main(String[] args) {
        int n = 10;
        String answer = solution(n);
        System.out.println(answer);
    }
    
    private static String solution(int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        int remain = 0;
        
        while(n > 0) {
            remain = n%3;
            
            n /= 3;
            
            if (remain == 1) {
                sb.insert(0, "1");
            } else if (remain == 2) {
                sb.insert(0, "2");
            } else if (remain == 0) {
                sb.insert(0, "4");
                n--;
            }
            
            
        }
        
        answer = sb.toString();
        return answer;
    }

}
