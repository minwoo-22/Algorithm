package baekjoon.math1;

import java.io.*;

public class SugarDelivery {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        br.close();
        
        int result = N / 5;
        int remain = N % 5;
        int answer = 0;
        
        switch (remain) {
            case 0: 
                answer = result;
                break;
            case 1:
                answer = result - 1 + 2;
                break;
            case 2:
                if (N == 7) {
                    answer = -1;
                } else {
                    answer = result - 2 + 4;
                }
                break;
            case 3:
                answer = result + 1;
                break;
            case 4:
                if (N == 4) {
                    answer = -1;
                } else {
                    answer = result - 1 + 3;
                }
                break;
        }
        
        bw.write(String.valueOf(answer));
        bw.close();
    }

}
