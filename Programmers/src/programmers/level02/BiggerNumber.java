package programmers.level02;

import java.util.Arrays;
import java.util.Comparator;

public class BiggerNumber {
    public static void main(String[] args) {
        int[] numbers = {3,304,304,34,5,9};
        String answer = solution(numbers);
        System.out.println(answer);
    }
    
    static String solution(int[] numbers) {
        String answer = "";
        String[] strs = new String[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            strs[i] = numbers[i]+"";
        }
        
        Arrays.sort(strs, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return ((s2+s1).compareTo(s1+s2));
            }
        });
        
        if (strs[0].equals("0")) return "0";
        
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            sb.append(strs[i]);
        }
        
        answer = sb.toString();
        return answer;
    }
}
