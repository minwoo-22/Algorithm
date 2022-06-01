package programmers.level01;

import java.util.Arrays;

public class SecretMap {

    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] str = solution(n, arr1, arr2);
        System.out.println(Arrays.toString(str));
    }
    
    private static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        Arrays.fill(answer, "");
        
        int[][] result = new int[n][n];
        
        int temp1 = 0;
        int temp2 = 0;
        
        for (int i = 0; i < n; i++) {
            int number1 = arr1[i];
            int number2 = arr2[i];
            for (int j = n-1; j >= 0; j--) {
                temp1 = (number1 % 2);
                number1 /= 2;
                
                temp2 = number2 % 2;
                number2 /= 2;
                
                if (temp1 == 1 && temp2 == 1) {
                    result[i][j] = 1;
                } else if (temp1 == 0 && temp2 == 0) {
                    result[i][j] = 0;
                } else {
                    result[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (result[i][j] == 1) {
                    answer[i] += "#";
                } else {
                    answer[i] += " ";
                }
            }
        }
        
        return answer;
    }

}
