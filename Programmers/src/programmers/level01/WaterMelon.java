package programmers.level01;

public class WaterMelon {

    public static void main(String[] args) {
        int n = 3;
        String answer = solution(n);
        System.out.println(answer);
    }
    
    private static String solution(int n) {
        String answer = "";
        String s = "수박";
        int index = 0;
        
        for (int i = 0; i < n; i++) {
            index = i % 2;
            answer += s.charAt(index);
        }
        
        return answer;
    }

}
