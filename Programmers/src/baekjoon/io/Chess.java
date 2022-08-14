package baekjoon.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chess {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] chessNum = {1, 1, 2, 2, 2, 8};
        int[] answer = new int[chessNum.length];
        
        for (int i = 0; i < chessNum.length; i++) {
            int num = Integer.parseInt(st.nextToken());
            
            answer[i] = chessNum[i] - num;
        }
        
        for (int num : answer) {
            System.out.print(num + " ");
        }
    }

}
