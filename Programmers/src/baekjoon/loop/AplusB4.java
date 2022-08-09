package baekjoon.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class AplusB4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> list = new ArrayList<>();
        
        StringTokenizer st;
        String value;

        while((value=br.readLine()) != null){

            st = new StringTokenizer(value, " ");

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            
            list.add(A + B);

        }
        
        for (int num : list) {
            bw.write(String.valueOf(num) + "\n");
        }
        
        bw.close();
    }

}
