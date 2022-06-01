package programmers.level01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyPad {

    public static void main(String[] args) {
        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";
        System.out.println(Solution(numbers, hand));
    }
    
    public static String Solution(int[] numbers, String hand) {
        String answer = "";
        int number = 1;
        List<Integer> left = Arrays.asList(1, 4, 7);
        List<Integer> right = Arrays.asList(3, 6, 9);
        Map<Integer, int[]> pad = new HashMap<>();
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                int[] value = {i, j};
                if (i != 3) {
                    pad.put(number++, value);
                } else  {
                    if (j == 1) pad.put(0, value);
                }
            }
        }
        System.out.println(number);
        int[] leftFinger = {3, 0};
        int[] rightFinger = {3, 2};
        
        for (int i = 0; i < numbers.length; i++) {
            if (left.contains(numbers[i])) {
                answer += "L";
                leftFinger = pad.get(numbers[i]);
                System.out.println("leftFinger : " + Arrays.toString(leftFinger));
            } else if (right.contains(numbers[i])) {
                answer += "R";
                rightFinger = pad.get(numbers[i]);
                System.out.println("rightFinger : " + Arrays.toString(rightFinger));
            } else {
                int[] numberLocation = pad.get(numbers[i]);
                int lengthL = Math.abs(numberLocation[0] - leftFinger[0]) + 
                        Math.abs(numberLocation[1] - leftFinger[1]);
                System.out.println("lengthL : " + lengthL+" "+Math.abs(numberLocation[0] - leftFinger[0]) + 
                        Math.abs(numberLocation[1] - leftFinger[1]));
                int lengthR = Math.abs(numberLocation[0] - rightFinger[0]) + 
                        Math.abs(numberLocation[1] - rightFinger[1]);
                System.out.println("lengthR : " + lengthR+" " + Math.abs(numberLocation[0] - rightFinger[0]) + 
                        Math.abs(numberLocation[1] - rightFinger[1]));
                if (hand.equals("left")) {
                    if (lengthL <= lengthR) {
                        answer += "L";
                        leftFinger = numberLocation;
                    } else {
                        answer += "R";
                        rightFinger = numberLocation;
                    }
                } else {
                    if (lengthR <= lengthL) {
                        answer += "R";
                        rightFinger = numberLocation;
                    } else {
                        answer += "L";
                        leftFinger = numberLocation;
                    }
                }
            }
        }
        
        
        
        
        
        return answer;
    }

}
