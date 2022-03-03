package level01;

import java.util.Arrays;


public class Pocketmon {

    public static void main(String[] args) {
        int[] nums = {3,1,2,3};
        System.out.println(solution(nums));
    }
    
    private static int solution(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);
        int size = nums.length/2;
        
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (temp != nums[i]) {
                answer++;
                temp = nums[i];
            }
            if (answer >= size) break;
        }
        
        return answer;
    }

}
