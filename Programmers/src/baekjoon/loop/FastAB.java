package baekjoon.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class FastAB {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int caseNum = Integer.parseInt(br.readLine());
        int[] sums = new int[caseNum];
        
        for (int i = 0; i < caseNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sums[i] = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
        }
        br.close();
        
        for (int i = 0; i < sums.length; i++) {
            bw.write(String.valueOf(sums[i]) + "\n");
        }
        bw.flush();
        bw.close();
    }

}
