package baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AplusB3 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(br.readLine());
        
        int[] sums = new int[caseNum];
        
        for (int i = 0; i < sums.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sums[i] = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
        }
        
        for (int i = 0; i < sums.length; i++) {
            System.out.println(sums[i]);
        }
    }
}
