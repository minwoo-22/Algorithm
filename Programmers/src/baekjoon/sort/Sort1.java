package baekjoon.sort;

import java.io.*;

public class Sort1 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[j] < numbers[j-1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j-1];
                    numbers[j-1] = temp;
                }
            }
        }
        // 메모리&속도 비교
        // 버블 정렬 직접 구현했을 때랑 Arrays.sort 사용했을 때랑 메모리랑 속도 차이가
        // 별로 안남. 미세하게 Arrays.sort가 더 빠름. (백준에서 실행 결과)
//        Arrays.sort(numbers);
        for (int n : numbers) {
            System.out.println(n);
        }
    }
}
