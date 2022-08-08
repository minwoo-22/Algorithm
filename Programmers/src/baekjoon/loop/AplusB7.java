package baekjoon.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class AplusB7 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int caseNum = Integer.parseInt(br.readLine());
        int[] sums = new int[caseNum];
        
        for (int i = 0; i < sums.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sums[i] = A + B;
        }
        br.close();
        
        for (int i = 0; i < sums.length; i++) {
            bw.write("Case #" + (i+1) + ": " + String.valueOf(sums[i]) + "\n");
        }
        bw.flush();
        bw.close();
    }

}
