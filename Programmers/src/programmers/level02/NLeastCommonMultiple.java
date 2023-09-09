package programmers.level02;

import java.util.Arrays;

// 두 수의 최소공배수는 두 수를 곱한 수에 두 수의 최대공약수를 나누면 된다.
public class NLeastCommonMultiple {
    public static void main(String[] args) {
        int arr[] = {2, 6, 8, 14};
        int answer = 0;

        if (arr.length == 1) {
            answer = arr[0];
        } else {
            answer = (arr[0] * arr[1]) / getGCD(arr[0], arr[1]);
            for (int i = 2; i < arr.length; i++) {
                answer = (answer * arr[i]) / getGCD(answer, arr[i]);
            }
        }

        System.out.println(answer);
    }

    // 두 수의 최대공약수 구하기
    // 유클리드호제법
    private static int getGCD(int a, int b) {
        int remain = a % b;
        if (remain == 0) return b;
        else return getGCD(b, remain);
    }
}
