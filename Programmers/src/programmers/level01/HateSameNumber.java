package programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HateSameNumber {

    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        int[] answer = solution(arr);
        System.out.println(Arrays.toString(answer));
    }
    
    private static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
                
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] != arr[i]) list.add(arr[i]);
        }
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }

}
