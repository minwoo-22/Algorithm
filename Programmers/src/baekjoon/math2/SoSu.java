package baekjoon.math2;

import java.io.*;
import java.util.StringTokenizer;

public class SoSu {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(st.nextToken()); 
        }
        
        System.out.println(findSosu(numbers));
    }
    
    private static int findSosu(int[] numbers) {
        int answer = 0;
        // 약수 카운트
        int cnt = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 2; j <= numbers[i]; j++) {
                if (numbers[i] % j == 0) {
                    cnt++;
                }
                if (cnt == 2) {
                    break;
                }
            }
            if (cnt == 1) {
                answer++;
            }
            cnt = 0;
        }
        
        return answer;
    }

}
