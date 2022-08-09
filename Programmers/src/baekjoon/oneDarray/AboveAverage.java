package baekjoon.oneDarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AboveAverage {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(br.readLine());
        double[] answer = new double[caseNum];
        
        double sum = 0;
        double average = 0;
        int cnt = 0;
        StringTokenizer st;
        
        for (int i = 0; i < caseNum; i++) {
            st = new StringTokenizer(br.readLine());
            int[] num = new int[Integer.parseInt(st.nextToken())];
            for (int j = 0; j < num.length; j++) {
                num[j] = Integer.parseInt(st.nextToken());
                sum += num[j];
            }
            // 평균
            average = sum / num.length;
            
            for (int j = 0; j < num.length; j++) {
                if (num[j] > average) {
                    cnt++;
                }
            }
            answer[i] = ((double)cnt / num.length) * 100;
            sum = 0;
            cnt = 0;
            average = 0;
        }
        
        for (int i = 0; i < answer.length; i++) {
            System.out.printf("%.3f%%\n", answer[i]);
        }
    }
}
