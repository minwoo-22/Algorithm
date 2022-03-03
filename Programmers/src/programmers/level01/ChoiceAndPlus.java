package level01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ChoiceAndPlus {

    public static void main(String[] args) {
        int[] numbers = {5,0,2,7};
        int[] result = solution(numbers);
        System.out.println(Arrays.toString(result));
    }
    
    private static int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                set.add(numbers[i]+numbers[j]);
            }
        }
        int[] answer = new int[set.size()];
        int i = 0;
        for (int num : set) {
            answer[i] = num;
            i++;
        }
        Arrays.sort(answer);
        return answer;
    }

}
