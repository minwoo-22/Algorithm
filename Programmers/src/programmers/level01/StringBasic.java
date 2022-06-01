package programmers.level01;

public class StringBasic {

    public static void main(String[] args) {
        String s = "a123";
        boolean answer = solution(s);
        System.out.println(answer);
    }
    
    private static boolean solution(String s) {
        boolean answer = true;
        
        if (s.length() != 4 && s.length() != 6) return false;
        
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) > '9') return false;
        }
        
        return answer;
    }

}
