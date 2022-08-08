package baekjoon.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class AplusB8 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int caseNum = Integer.parseInt(br.readLine());
        int[] a = new int[caseNum];
        int[] b = new int[caseNum];
        int[] sums = new int[caseNum];
        
        for (int i = 0; i < sums.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
            sums[i] = a[i] + b[i];
        }
        br.close();
        
        for (int i = 0; i < sums.length; i++) {
            bw.write("Case #" + (i+1) + ": " + a[i] + " + " + b[i] + " = " + String.valueOf(sums[i]) + "\n");
        }
        bw.flush();
        bw.close();
    }

}
