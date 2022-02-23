package level01;

import java.util.ArrayList;
import java.util.List;

public class CaesarCipher {

    public static void main(String[] args) {
        String s = "AaZz";
        int n = 25;
        String result = solution(s, n);
        System.out.println(result);
    }
    
    private static String solution(String s, int n) {
        String answer = "";
        char alphabet;
        for (int i = 0; i < s.length(); i++) {
            alphabet = s.charAt(i);
            if (alphabet >= 'A' && alphabet <= 'Z') {
                if (alphabet+n > 'Z') {
                    answer += (char)(alphabet+n-26);
                } else {
                    answer += (char)(alphabet+n);
                }
            } else if (alphabet >= 'a' && alphabet <= 'z') {
                if (alphabet+n > 'z') {
                    answer += (char)(alphabet+n-26);
                } else {
                    answer += (char)(alphabet+n);
                }
            } else if (alphabet == ' ') {
                answer += ' ';
            }
        }
        return answer;
    }

}
