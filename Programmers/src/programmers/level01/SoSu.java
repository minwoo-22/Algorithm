package programmers.level01;

public class SoSu {

    public static void main(String[] args) {
        int[] nums = {1,2,7,6,4};
        int answer = solution(nums);
        System.out.println(answer);
    }
    
//    private static int Solution(int[] nums) {
//        int answer = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                for (int k = j+1; k < nums.length; k++) {
//                    System.out.println("i:"+i+", j:"+j+", k:"+k);
//                    int number = nums[i] + nums[j] + nums[k];
//                    int checker = 0;
//                    for (int h = 2; h <= number; h++) {
//                        if (number % h == 0) {
//                            break;
//                        } else if (checker >= 2){
//                            break;
//                        } else {
//                            checker++;
//                        }
//                    }
//                    if (checker == 1) answer += 1;
//                }
//            }
//        }
//        
//        return answer;
//    }
    public static int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    int number = nums[i] + nums[j] + nums[k];
                    int checker = 0;
                    for (int h = 2; h <= number; h++) {
                        if (number % h == 0) {
                            if (h != number) break;
                            else checker++;
                        } 
                    }
                    if (checker == 1) answer += 1;
                }
            }
        }
        
        return answer;
    }

}
