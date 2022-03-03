package level01;

public class PYNumber {

    public static void main(String[] args) {
        String s = "pPoooyY";
        boolean answer = solution(s);
        System.out.println(answer);
    }
    
    private static boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                p += 1;
            }
            if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                y += 1;
            }
        }
        
        if (p != y) answer = false;
        return answer;
    }

}
