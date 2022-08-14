package baekjoon.math2;

import java.io.*;
import java.util.ArrayList;

public class SoSu2 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        br.close();
        
        // 소수를 담기 위한 ArrayList
        ArrayList<Integer> arr = new ArrayList<>();
        // 약수 카운터
        int cnt = 0;
        
        for (int i = N; i <= M; i++) {
            if (i == 2) {
                arr.add(2);
                continue;
            }
            // 짝수는 건너 뛰기
            if (i % 2 == 0) {
                continue;
            }
            
            for (int j = 3; j <= i; j += 2) {
                if (i % j == 0) {
                    cnt++;
                }
                if (cnt >= 2) break;
            }
            
            if (cnt == 1) {
                arr.add(i);
            }
            cnt = 0;
        }
        
        if (arr.isEmpty()) {
            bw.write("-1");
        } else {
            bw.write(String.valueOf(sum(arr)+"\n"));
            bw.write(String.valueOf(arr.get(0)));
        }
        bw.close();
    }
    
    private static int sum(ArrayList<Integer> arr) {
        int answer = 0;
        for (int num : arr) {
            answer += num;
        }
        return answer;
    }
    
}
