package programmers.level01;

import java.util.Arrays;
import java.util.Collections;

public class StringSortDESC {

    public static void main(String[] args) {
        String s = "Zbcdefg";
        String answer = solution(s);
        System.out.println(answer);
    }
    
    private static String solution(String s) {
        String answer = "";
        Character[] str = new Character[s.length()];
        for (int i = 0; i < str.length; i++) {
            str[i] = s.charAt(i);
        }
        Arrays.sort(str, Collections.reverseOrder());
        
        for (int i = 0; i < str.length; i++) {
            answer += str[i];
        }
        
        return answer;
    }

}
