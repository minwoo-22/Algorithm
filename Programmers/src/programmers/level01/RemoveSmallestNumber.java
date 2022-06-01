package programmers.level01;

import java.util.Arrays;

public class RemoveSmallestNumber {

    public static void main(String[] args) {
        int[] arr = {10};
        System.out.println(Arrays.toString(solution(arr)));
    }
    
    private static int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        
        if (arr.length == 1) {
            return new int[] {-1};
        }
        
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == smallest) continue;
            answer[j] = arr[i];
            j++;
        }
        return answer;
    }

}
