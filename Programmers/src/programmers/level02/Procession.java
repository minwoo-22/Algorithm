package programmers.level02;

import java.util.Arrays;

public class Procession {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3, 4}, {1, 2, 3, 4}};
        int[][] arr2 = {{1, 2}, {1, 2}, {1, 2}, {1, 2}};

        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                int num = 0;
                for (int k = 0; k < arr1[0].length; k++) {
                    num += (arr1[i][k] * arr2[k][j]);
                }
                answer[i][j] = num;
            }
        }

//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1[0].length; j++) {
//                System.out.print(answer[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
