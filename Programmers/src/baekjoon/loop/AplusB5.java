package baekjoon.loop;

import java.io.*;
import java.util.*;

public class AplusB5 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> list = new ArrayList<>();
        
        
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if (A == 0 && B == 0) {
                break;
            }
            list.add(A + B);
        }
        
        for (int num : list) {
            bw.write(num + "\n");
        }
        
        bw.flush();
        bw.close();
    }

}
