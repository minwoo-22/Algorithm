package programmers.level01;

import java.util.Arrays;
import java.util.Collections;

public class IntegerDescendingOrder {

    public static void main(String[] args) {
        long n = 118372;
        long answer = solution(n);
        System.out.println(answer);
    }
    
    private static long solution(long n) {
        long answer = 0;
        String number = String.valueOf(n);
        Long[] arr = new Long[number.length()];
        for (int i = 0; i < number.length(); i++) {
            arr[i] = Long.parseLong(number.charAt(i)+"");
        }
        Arrays.sort(arr, Collections.reverseOrder());
        
        String sortNumber = "";
        for (int i = 0; i < arr.length; i++) {
            sortNumber += arr[i];
        }
        
        answer = Long.parseLong(sortNumber);
        return answer;
    }
}
