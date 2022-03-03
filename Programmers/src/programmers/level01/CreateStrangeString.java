package level01;

public class CreateStrangeString {

    public static void main(String[] args) {
        String s = "Try hElLO   wORld ";
        String answer = solution(s);
        System.out.println(answer);
    }
    
    private static String solution(String s) {
        String answer = "";
        
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j % 2 == 1) {
                answer += String.valueOf(s.charAt(i)).toLowerCase();
                j++;
            } else if (j % 2 == 0){
                answer += String.valueOf(s.charAt(i)).toUpperCase();
                j++;
            } 
            
            if (s.charAt(i) == ' ') j = 0;
                
        }
        
        
        return answer;
    }

}
