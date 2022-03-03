package level01;

import java.util.Arrays;

public class ReverseNumberArray {

    public static void main(String[] args) {
        long n = 12345;
        int[] answer = solution(n);
        System.out.println(Arrays.toString(answer));
    }
    
    private static int[] solution(long n) {
        String number = String.valueOf(n);
        int[] answer = new int[number.length()];
        
        int j = 0;
        for (int i = number.length()-1; i >= 0; i--) {
            answer[j] = Integer.parseInt(number.charAt(i)+"");
            j++;
        }
        
        
        return answer;
    }

}
